package grpcclientapp;

import cnv2024tf.*;
import io.grpc.stub.StreamObserver;

public class ForumMessageStream implements StreamObserver<ForumMessage> {
    Boolean isCompleted = false;

    @Override
    public void onNext(ForumMessage forumMessage) {
        System.out.println(
                forumMessage.getTopicName() + "- "+ forumMessage.getFromUser()+": " + forumMessage.getTxtMsg()
        );
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println(throwable.getMessage());
    }

    @Override
    public void onCompleted() {
        isCompleted = true;
        System.out.println("O processo foi finalizado");
    }
}
