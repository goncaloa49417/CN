package cnv2024tf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * subscribe a topic
 * rpc topicSubscribe(SubscribeUnSubscribe) returns (stream ForumMessage);
 * unsubscribe a topic
 * rpc topicUnSubscribe(SubscribeUnSubscribe) returns (google.protobuf.Empty);
 * get all topics in server
 * rpc getAllTopics(google.protobuf.Empty) returns (ExistingTopics);
 * send a message to a topic
 * rpc publishMessage(ForumMessage) returns (google.protobuf.Empty);
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.0)",
    comments = "Source: ServiceContract.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class Cnv2024tfGrpc {

  private Cnv2024tfGrpc() {}

  public static final java.lang.String SERVICE_NAME = "cnv2024tf.Cnv2024tf";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cnv2024tf.ImageRequest,
      cnv2024tf.ImageResponse> getSubmitImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "submitImage",
      requestType = cnv2024tf.ImageRequest.class,
      responseType = cnv2024tf.ImageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cnv2024tf.ImageRequest,
      cnv2024tf.ImageResponse> getSubmitImageMethod() {
    io.grpc.MethodDescriptor<cnv2024tf.ImageRequest, cnv2024tf.ImageResponse> getSubmitImageMethod;
    if ((getSubmitImageMethod = Cnv2024tfGrpc.getSubmitImageMethod) == null) {
      synchronized (Cnv2024tfGrpc.class) {
        if ((getSubmitImageMethod = Cnv2024tfGrpc.getSubmitImageMethod) == null) {
          Cnv2024tfGrpc.getSubmitImageMethod = getSubmitImageMethod =
              io.grpc.MethodDescriptor.<cnv2024tf.ImageRequest, cnv2024tf.ImageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "submitImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cnv2024tf.ImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cnv2024tf.ImageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new Cnv2024tfMethodDescriptorSupplier("submitImage"))
              .build();
        }
      }
    }
    return getSubmitImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cnv2024tf.LabelRequest,
      cnv2024tf.LabelResponse> getGetImageLabelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getImageLabels",
      requestType = cnv2024tf.LabelRequest.class,
      responseType = cnv2024tf.LabelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cnv2024tf.LabelRequest,
      cnv2024tf.LabelResponse> getGetImageLabelsMethod() {
    io.grpc.MethodDescriptor<cnv2024tf.LabelRequest, cnv2024tf.LabelResponse> getGetImageLabelsMethod;
    if ((getGetImageLabelsMethod = Cnv2024tfGrpc.getGetImageLabelsMethod) == null) {
      synchronized (Cnv2024tfGrpc.class) {
        if ((getGetImageLabelsMethod = Cnv2024tfGrpc.getGetImageLabelsMethod) == null) {
          Cnv2024tfGrpc.getGetImageLabelsMethod = getGetImageLabelsMethod =
              io.grpc.MethodDescriptor.<cnv2024tf.LabelRequest, cnv2024tf.LabelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getImageLabels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cnv2024tf.LabelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cnv2024tf.LabelResponse.getDefaultInstance()))
              .setSchemaDescriptor(new Cnv2024tfMethodDescriptorSupplier("getImageLabels"))
              .build();
        }
      }
    }
    return getGetImageLabelsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static Cnv2024tfStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<Cnv2024tfStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<Cnv2024tfStub>() {
        @java.lang.Override
        public Cnv2024tfStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new Cnv2024tfStub(channel, callOptions);
        }
      };
    return Cnv2024tfStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static Cnv2024tfBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<Cnv2024tfBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<Cnv2024tfBlockingStub>() {
        @java.lang.Override
        public Cnv2024tfBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new Cnv2024tfBlockingStub(channel, callOptions);
        }
      };
    return Cnv2024tfBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static Cnv2024tfFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<Cnv2024tfFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<Cnv2024tfFutureStub>() {
        @java.lang.Override
        public Cnv2024tfFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new Cnv2024tfFutureStub(channel, callOptions);
        }
      };
    return Cnv2024tfFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * subscribe a topic
   * rpc topicSubscribe(SubscribeUnSubscribe) returns (stream ForumMessage);
   * unsubscribe a topic
   * rpc topicUnSubscribe(SubscribeUnSubscribe) returns (google.protobuf.Empty);
   * get all topics in server
   * rpc getAllTopics(google.protobuf.Empty) returns (ExistingTopics);
   * send a message to a topic
   * rpc publishMessage(ForumMessage) returns (google.protobuf.Empty);
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void submitImage(cnv2024tf.ImageRequest request,
        io.grpc.stub.StreamObserver<cnv2024tf.ImageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubmitImageMethod(), responseObserver);
    }

    /**
     */
    default void getImageLabels(cnv2024tf.LabelRequest request,
        io.grpc.stub.StreamObserver<cnv2024tf.LabelResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetImageLabelsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Cnv2024tf.
   * <pre>
   * subscribe a topic
   * rpc topicSubscribe(SubscribeUnSubscribe) returns (stream ForumMessage);
   * unsubscribe a topic
   * rpc topicUnSubscribe(SubscribeUnSubscribe) returns (google.protobuf.Empty);
   * get all topics in server
   * rpc getAllTopics(google.protobuf.Empty) returns (ExistingTopics);
   * send a message to a topic
   * rpc publishMessage(ForumMessage) returns (google.protobuf.Empty);
   * </pre>
   */
  public static abstract class Cnv2024tfImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return Cnv2024tfGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Cnv2024tf.
   * <pre>
   * subscribe a topic
   * rpc topicSubscribe(SubscribeUnSubscribe) returns (stream ForumMessage);
   * unsubscribe a topic
   * rpc topicUnSubscribe(SubscribeUnSubscribe) returns (google.protobuf.Empty);
   * get all topics in server
   * rpc getAllTopics(google.protobuf.Empty) returns (ExistingTopics);
   * send a message to a topic
   * rpc publishMessage(ForumMessage) returns (google.protobuf.Empty);
   * </pre>
   */
  public static final class Cnv2024tfStub
      extends io.grpc.stub.AbstractAsyncStub<Cnv2024tfStub> {
    private Cnv2024tfStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Cnv2024tfStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new Cnv2024tfStub(channel, callOptions);
    }

    /**
     */
    public void submitImage(cnv2024tf.ImageRequest request,
        io.grpc.stub.StreamObserver<cnv2024tf.ImageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubmitImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getImageLabels(cnv2024tf.LabelRequest request,
        io.grpc.stub.StreamObserver<cnv2024tf.LabelResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetImageLabelsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Cnv2024tf.
   * <pre>
   * subscribe a topic
   * rpc topicSubscribe(SubscribeUnSubscribe) returns (stream ForumMessage);
   * unsubscribe a topic
   * rpc topicUnSubscribe(SubscribeUnSubscribe) returns (google.protobuf.Empty);
   * get all topics in server
   * rpc getAllTopics(google.protobuf.Empty) returns (ExistingTopics);
   * send a message to a topic
   * rpc publishMessage(ForumMessage) returns (google.protobuf.Empty);
   * </pre>
   */
  public static final class Cnv2024tfBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<Cnv2024tfBlockingStub> {
    private Cnv2024tfBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Cnv2024tfBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new Cnv2024tfBlockingStub(channel, callOptions);
    }

    /**
     */
    public cnv2024tf.ImageResponse submitImage(cnv2024tf.ImageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubmitImageMethod(), getCallOptions(), request);
    }

    /**
     */
    public cnv2024tf.LabelResponse getImageLabels(cnv2024tf.LabelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetImageLabelsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Cnv2024tf.
   * <pre>
   * subscribe a topic
   * rpc topicSubscribe(SubscribeUnSubscribe) returns (stream ForumMessage);
   * unsubscribe a topic
   * rpc topicUnSubscribe(SubscribeUnSubscribe) returns (google.protobuf.Empty);
   * get all topics in server
   * rpc getAllTopics(google.protobuf.Empty) returns (ExistingTopics);
   * send a message to a topic
   * rpc publishMessage(ForumMessage) returns (google.protobuf.Empty);
   * </pre>
   */
  public static final class Cnv2024tfFutureStub
      extends io.grpc.stub.AbstractFutureStub<Cnv2024tfFutureStub> {
    private Cnv2024tfFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Cnv2024tfFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new Cnv2024tfFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cnv2024tf.ImageResponse> submitImage(
        cnv2024tf.ImageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubmitImageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cnv2024tf.LabelResponse> getImageLabels(
        cnv2024tf.LabelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetImageLabelsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUBMIT_IMAGE = 0;
  private static final int METHODID_GET_IMAGE_LABELS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUBMIT_IMAGE:
          serviceImpl.submitImage((cnv2024tf.ImageRequest) request,
              (io.grpc.stub.StreamObserver<cnv2024tf.ImageResponse>) responseObserver);
          break;
        case METHODID_GET_IMAGE_LABELS:
          serviceImpl.getImageLabels((cnv2024tf.LabelRequest) request,
              (io.grpc.stub.StreamObserver<cnv2024tf.LabelResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getSubmitImageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cnv2024tf.ImageRequest,
              cnv2024tf.ImageResponse>(
                service, METHODID_SUBMIT_IMAGE)))
        .addMethod(
          getGetImageLabelsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cnv2024tf.LabelRequest,
              cnv2024tf.LabelResponse>(
                service, METHODID_GET_IMAGE_LABELS)))
        .build();
  }

  private static abstract class Cnv2024tfBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    Cnv2024tfBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cnv2024tf.ServiceContract.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Cnv2024tf");
    }
  }

  private static final class Cnv2024tfFileDescriptorSupplier
      extends Cnv2024tfBaseDescriptorSupplier {
    Cnv2024tfFileDescriptorSupplier() {}
  }

  private static final class Cnv2024tfMethodDescriptorSupplier
      extends Cnv2024tfBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    Cnv2024tfMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (Cnv2024tfGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new Cnv2024tfFileDescriptorSupplier())
              .addMethod(getSubmitImageMethod())
              .addMethod(getGetImageLabelsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
