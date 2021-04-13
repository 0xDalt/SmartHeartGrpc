package grpc.user;



import java.io.IOException;
import java.util.logging.Logger;


import grpc.user.UserServiceGrpc.UserServiceImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;


public class userLoginServer1 extends UserServiceImplBase {

	private static final Logger logger = Logger.getLogger(userLoginServer1.class.getName());

	public static void main(String[] args) {
		
		userLoginServer1 userServer = new userLoginServer1();
		
		int port = 8080;
	    
		try {
			Server server = ((ServerBuilder) ServerBuilder.forPort(port))
			.addService(userServer)
			    .build()
			    .start();
			System.out.println("Server user Started");
			
			 server.awaitTermination();

			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    logger.info("Server started, listening on " + port);
	    		    
	   
	}
	
	
	@Override
	public void login(LoginRequest request,  StreamObserver<LoginResponse> responseObserver) {
		    
		System.out.println("receiving login request V 1.2");
		
		LoginResponse reply = LoginResponse.newBuilder().setResponseMessage("Hi out there again " + request.getUsername()).build();
	     
		 responseObserver.onNext(reply);
	     
	     responseObserver.onCompleted();
	
	}
}
	