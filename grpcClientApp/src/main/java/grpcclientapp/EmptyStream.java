package grpcclientapp;

import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;

public class EmptyStream implements StreamObserver<Empty> {
    Boolean isCompleted = false;
    @Override
    public void onNext(Empty empty) {

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
