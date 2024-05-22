package grpcclientapp;

import com.google.cloud.storage.*;
import com.google.protobuf.Empty;
import cnv2024tf.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import io.opencensus.metrics.export.Distribution;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Semaphore;

public class Client {
    // generic ClientApp for Calling a grpc Service
    private static String svcIP = "localhost";
    private static int svcPort = 8000;
    private static ManagedChannel channel;
    private static Cnv2024tfGrpc.Cnv2024tfBlockingStub blockingStub;
    private static Cnv2024tfGrpc.Cnv2024tfStub noBlockStub;

    public static void main(String[] args) {
        try {
            if (args.length == 2) {
                svcIP = args[0]; svcPort = Integer.parseInt(args[1]);
            }
            System.out.println("connect to " + svcIP + ":" + svcPort);
            channel = ManagedChannelBuilder.forAddress(svcIP, svcPort)
                    // Channels are secure by default (via SSL/TLS).
                    // For the example we disable TLS to avoid
                    // needing certificates.
                    .usePlaintext()
                    .build();
            blockingStub = Cnv2024tfGrpc.newBlockingStub(channel);
            noBlockStub = Cnv2024tfGrpc.newStub(channel);

            // Call service operations for example ping server
            boolean end = false;
            while (!end) {
                try {
                    int option = Menu();
                    switch (option) {
                        case 1:
                            submitImage();  break;
                        case 2:
                            getImageLabels(); break;
                        case 99:
                            System.exit(0);
                    }
                } catch (Exception ex) {
                    System.out.println("Execution call Error  !");
                    ex.printStackTrace();
                }
            }
            read("prima enter to end", new Scanner(System.in));
        } catch (Exception ex) {
            System.out.println("Unhandled exception");
            ex.printStackTrace();
        }
    }

    static void submitImage(){
        String pathImage = read("Caminho para a imagem:", new Scanner(System.in));

        File imageFile = new File(pathImage);
        byte[] imageData;
        try {
            imageData = Files.readAllBytes(imageFile.toPath());
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Erro ao fazer download da imagem");
            return;
        }
        ImageRequest request = ImageRequest.newBuilder()
                .setImageName(imageFile.getName())
                .setImageData(com.google.protobuf.ByteString.copyFrom(imageData))
                .build();

        ImageResponse res = blockingStub.submitImage(request);

        System.out.println("ID a usar para fazer operações à imagem submetida: " + res.getId());
    }

    static void getImageLabels(){
        String id = read("Submeter id:", new Scanner(System.in));
    }

    /*
    static void topicSubscribe(){
        String topicName = read("Topic name:", new Scanner(System.in));
        String userName = read("User name:", new Scanner(System.in));

        SubscribeUnSubscribe request = SubscribeUnSubscribe
                .newBuilder()
                .setTopicName(topicName)
                .setUsrName(userName)
                .build();

        noBlockStub.topicSubscribe( request, new ForumMessageStream() );
    }

    static void topicUnSubscribe(){
        String topicName = read("Topic name:", new Scanner(System.in));
        String userName = read("User name:", new Scanner(System.in));

        SubscribeUnSubscribe request = SubscribeUnSubscribe
                .newBuilder()
                .setTopicName(topicName)
                .setUsrName(userName)
                .build();

        noBlockStub.topicUnSubscribe(request, new EmptyStream());
    }

    static void getAllTopics(){
        ExistingTopics allTopics = blockingStub.getAllTopics(Empty.newBuilder().build());
        allTopics.getTopicNameList().forEach(System.out::println); // = forEach(topic -> System.out.println(topic))
    }

    static void publishMessage(){
        String topicName = read("Topic name:", new Scanner(System.in));
        String userName = read("User name:", new Scanner(System.in));
        String txtMessage = read("Message to publish:", new Scanner(System.in));

        String[] userMsg = txtMessage.split(";");

        if(userMsg.length == 3) {

            ForumMessage forum = ForumMessage.newBuilder()
                    .setTopicName(topicName)
                    .setFromUser(userName)
                    .setTxtMsg(userMsg[0])
                    .build();

            noBlockStub.publishMessage(forum, new EmptyStream());

            StorageOptions storageOptions = StorageOptions.getDefaultInstance();
            Storage storage = storageOptions.getService();

            BlobId blobId = BlobId.of(userMsg[1], userMsg[2]);
            Blob blob = storage.get(blobId);
            blob.downloadTo(Paths.get("C:\\CN\\lab3Blobsq"));

        }else if(userMsg.length == 1){
            ForumMessage forum = ForumMessage.newBuilder()
                    .setTopicName(topicName)
                    .setFromUser(userName)
                    .setTxtMsg(txtMessage)
                    .build();

            noBlockStub.publishMessage(forum, new EmptyStream());
        }else {
            System.out.println("...; ...; ...");
        }

    }
     */

    private static int Menu() {
        int op;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println();
            System.out.println("    MENU");
            System.out.println(" 1 - Subscribe to a topic :)");
            System.out.println(" 2 - Unsubscribe to a topic (;_;)");
            System.out.println(" 3 - Get all topics to subscribe to ;)");
            System.out.println(" 4 - Publish a message :o");
            System.out.println("99 - Exit");
            System.out.println();
            System.out.println("Choose an Option?");
            op = scan.nextInt();
        } while (!((op >= 1 && op <= 4) || op == 99));
        return op;
    }

    private static String read(String msg, Scanner input) {
        System.out.println(msg);
        return input.nextLine();
    }
}
