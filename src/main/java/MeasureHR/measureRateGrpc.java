package MeasureHR;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: newMeasure.proto")
public final class measureRateGrpc {

  private measureRateGrpc() {}

  public static final String SERVICE_NAME = "MeasureHR.measureRate";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<MeasureHR.rateRequest,
      MeasureHR.rateResponse> getDisplayRateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "displayRate",
      requestType = MeasureHR.rateRequest.class,
      responseType = MeasureHR.rateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<MeasureHR.rateRequest,
      MeasureHR.rateResponse> getDisplayRateMethod() {
    io.grpc.MethodDescriptor<MeasureHR.rateRequest, MeasureHR.rateResponse> getDisplayRateMethod;
    if ((getDisplayRateMethod = measureRateGrpc.getDisplayRateMethod) == null) {
      synchronized (measureRateGrpc.class) {
        if ((getDisplayRateMethod = measureRateGrpc.getDisplayRateMethod) == null) {
          measureRateGrpc.getDisplayRateMethod = getDisplayRateMethod = 
              io.grpc.MethodDescriptor.<MeasureHR.rateRequest, MeasureHR.rateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "MeasureHR.measureRate", "displayRate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MeasureHR.rateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MeasureHR.rateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new measureRateMethodDescriptorSupplier("displayRate"))
                  .build();
          }
        }
     }
     return getDisplayRateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static measureRateStub newStub(io.grpc.Channel channel) {
    return new measureRateStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static measureRateBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new measureRateBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static measureRateFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new measureRateFutureStub(channel);
  }

  /**
   */
  public static abstract class measureRateImplBase implements io.grpc.BindableService {

    /**
     */
    public void displayRate(MeasureHR.rateRequest request,
        io.grpc.stub.StreamObserver<MeasureHR.rateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDisplayRateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDisplayRateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                MeasureHR.rateRequest,
                MeasureHR.rateResponse>(
                  this, METHODID_DISPLAY_RATE)))
          .build();
    }
  }

  /**
   */
  public static final class measureRateStub extends io.grpc.stub.AbstractStub<measureRateStub> {
    private measureRateStub(io.grpc.Channel channel) {
      super(channel);
    }

    private measureRateStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected measureRateStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new measureRateStub(channel, callOptions);
    }

    /**
     */
    public void displayRate(MeasureHR.rateRequest request,
        io.grpc.stub.StreamObserver<MeasureHR.rateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDisplayRateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class measureRateBlockingStub extends io.grpc.stub.AbstractStub<measureRateBlockingStub> {
    private measureRateBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private measureRateBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected measureRateBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new measureRateBlockingStub(channel, callOptions);
    }

    /**
     */
    public MeasureHR.rateResponse displayRate(MeasureHR.rateRequest request) {
      return blockingUnaryCall(
          getChannel(), getDisplayRateMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class measureRateFutureStub extends io.grpc.stub.AbstractStub<measureRateFutureStub> {
    private measureRateFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private measureRateFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected measureRateFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new measureRateFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<MeasureHR.rateResponse> displayRate(
        MeasureHR.rateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDisplayRateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DISPLAY_RATE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final measureRateImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(measureRateImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DISPLAY_RATE:
          serviceImpl.displayRate((MeasureHR.rateRequest) request,
              (io.grpc.stub.StreamObserver<MeasureHR.rateResponse>) responseObserver);
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

  private static abstract class measureRateBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    measureRateBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return MeasureHR.heartRateImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("measureRate");
    }
  }

  private static final class measureRateFileDescriptorSupplier
      extends measureRateBaseDescriptorSupplier {
    measureRateFileDescriptorSupplier() {}
  }

  private static final class measureRateMethodDescriptorSupplier
      extends measureRateBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    measureRateMethodDescriptorSupplier(String methodName) {
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
      synchronized (measureRateGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new measureRateFileDescriptorSupplier())
              .addMethod(getDisplayRateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
