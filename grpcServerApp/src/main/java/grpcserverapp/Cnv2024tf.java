package grpcserverapp;

import com.google.protobuf.Empty;
import cnv2024tf.*;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Cnv2024tf extends Cnv2024tfGrpc.Cnv2024tfImplBase {

    private final ConcurrentMap<String, ConcurrentMap<String, StreamObserver<ForumMessage>>> topicSubscribers = new ConcurrentHashMap<>();


    public Cnv2024tf(int svcPort) {
        System.out.println("Service is available on port:" + svcPort);
    }

    @Override
    public void submitImage(ImageRequest request, StreamObserver<ImageResponse> responseObserver){
        String name = request.getImageName();
    }

    @Override
    public void getImageLabels(LabelRequest request, StreamObserver<LabelResponse> responseObserver){

    }

    /*
    @Override
    public void topicSubscribe(SubscribeUnSubscribe request, StreamObserver<ForumMessage> responseObserver) {
        String topic = request.getTopicName();
        String subscriber = request.getUsrName();
        System.out.println("Subscriber " + subscriber + " subscribed to topic " + topic);
        topicSubscribers.putIfAbsent(topic, new ConcurrentHashMap<>());
        topicSubscribers.get(topic).put(subscriber, responseObserver);
    }

    @Override
    public void topicUnSubscribe(SubscribeUnSubscribe request, StreamObserver<Empty> responseObserver) {
        String topic = request.getTopicName();
        String subscriber = request.getUsrName();
        System.out.println("Subscriber " + subscriber + " unsubscribed from topic " + topic);
        topicSubscribers.get(topic).remove(subscriber).onCompleted();
    }

    @Override
    public void getAllTopics(Empty request, StreamObserver<ExistingTopics> responseObserver) {
        ExistingTopics.Builder existingTopics = ExistingTopics.newBuilder();
        existingTopics.addAllTopicName(topicSubscribers.keySet());
        responseObserver.onNext(existingTopics.build());
        responseObserver.onCompleted();
    }

    @Override
    public void publishMessage(ForumMessage request, StreamObserver<Empty> responseObserver) {
        String topic = request.getTopicName();
        String user = request.getFromUser();
        String message = request.getTxtMsg();

        System.out.println();
        System.out.println("Message received from " + request.getFromUser() + " for topic " + topic + "message: " + request.getTxtMsg());
        if (topicSubscribers.get(topic).get(user) == null) {
            System.out.println("You're not subscribed to " + topic);
            responseObserver.onError(new Exception("You're not subscribed to " + topic));
        } else if (topicSubscribers.get(topic) == null) {
            System.out.println("This topic doesn't exist: " + topic);
            responseObserver.onError(new Exception("You're unsubscribed " + topic + " or this topic doesn't exist"));
        } else {
            System.out.println("Message published to topic " + topic);
            topicSubscribers.get(topic).forEach((subscriber, observer) ->
                    observer.onNext(request)
            );
        }
    }
     */
}
