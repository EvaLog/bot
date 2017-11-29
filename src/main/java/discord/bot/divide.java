//package discord.bot;
//
//import java.util.HashMap;
//import java.util.Random;
//
//import net.dv8tion.jda.client.entities.Group;
//import net.dv8tion.jda.core.AccountType;
//import net.dv8tion.jda.core.JDA;
//import net.dv8tion.jda.core.JDABuilder;
//import net.dv8tion.jda.core.Permission;
//import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
//import net.dv8tion.jda.core.exceptions.PermissionException;
//import net.dv8tion.jda.core.exceptions.RateLimitedException;
//import net.dv8tion.jda.core.hooks.ListenerAdapter;
//import net.dv8tion.jda.core.entities.*;
//
//public class divide implements daointerface{
//	 
//	@Override
//	public HashMap<String, Object> devide(HashMap<String, Object> param) {
//		
//	
//		Random rand = new Random();  
//		String 첫번째팀=null;
//		String 두번째팀=null; 	
//		String 세번째팀=null;
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		if(msg.equals("2개")){
//			channel.sendMessage("참가를 쳐주십시오").queue();
//			for(int a=0;;) {
//			if(msg.equals("참가")) {
//				channel.sendMessage(user.getName()+"님 확인").queue();
//				int i =rand.nextInt(10);
//				if(i%2==0) {
//					첫번째팀+=user.getName();
//				}else {
//					두번째팀+=user.getName();
//				}
//				   				   				
//			}
//			if(msg.equals("끝")) {
//				channel.sendMessage(첫번째팀).queue();
//				channel.sendMessage(두번째팀).queue();
//				break;
//				}
//			}
//		}
//		return param;
//	}
//
//	
//}
