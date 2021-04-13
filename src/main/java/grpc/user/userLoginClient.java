package grpc.user;


	

	import java.util.concurrent.TimeUnit;
	import java.util.logging.Level;
	import java.util.logging.Logger;

import grpc.user.UserServiceGrpc.UserServiceBlockingStub;
import io.grpc.ManagedChannel;
	import io.grpc.ManagedChannelBuilder;
	import io.grpc.StatusRuntimeException;

	public class userLoginClient {

		private static final Logger logger = Logger.getLogger(userLoginClient.class.getName());

			  
		public static void main(String[] args) throws Exception {
			String host = "localhost";
			int port = 8080;
			
			ManagedChannel channel = ManagedChannelBuilder.
					forAddress(host, port)
					.usePlaintext()
					.build();
			
			UserServiceBlockingStub  blockingStub = UserServiceGrpc.newBlockingStub(channel);
					
		    userLoginClient client = new userLoginClient();
		    
		    try {
		    	 String UserName = "Paul";
		    	 LoginRequest request = LoginRequest.newBuilder().setUsername(UserName).build();
		    	 
		    	 LoginResponse response = blockingStub.login(request);
		    	 
		    	 logger.info("Greeting: " + response.getResponseMessage());
		    	 
		    } catch (StatusRuntimeException e) {
			    logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
			    
			    return;		
			    
		    } finally {
		    	//shutdown channel
		    	channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
		    }
		  }
		
		
	}
