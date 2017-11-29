package discord.bot;

import java.util.List;
import java.util.Random;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.client.entities.Group;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.Permission;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.exceptions.PermissionException;
import net.dv8tion.jda.core.exceptions.RateLimitedException;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import net.dv8tion.jda.core.entities.*;


public class App extends ListenerAdapter
{
    
    public static void main(String[] args)
    {
       
        try
        {
            JDA jda = new JDABuilder(AccountType.BOT)
                    .setToken("MzgzNTMzMjAyMDQ5OTkwNjU3.DPlo3A.tbZfbGlH5uSF5Lb2vXi05yhqiRI")           //The token of the account that is logging in.
                    .addEventListener(new App())  //An instance of a class that will handle events.
                    .buildBlocking();  //There are 2 ways to login, blocking vs async. Blocking guarantees that JDA will be completely loaded.
        }
        catch (LoginException e)
        {
            //If anything goes wrong in terms of authentication, this is the exception that will represent it
            e.printStackTrace();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        catch (RateLimitedException e)
        {
            e.printStackTrace();
        }
    }
    daointerface dif;
   
    @Override
    public void onMessageReceived(MessageReceivedEvent event)
    {
          JDA jda = event.getJDA();                      
        long responseNumber = event.getResponseNumber();
        User user = event.getAuthor();               
        Message message = event.getMessage();         
        MessageChannel channel = event.getChannel();   
                                                       

        String msg = message.getContent();             
                                                       

        boolean bot = user.isBot();                    
                                                       

       

        if (msg.equals("실험"))
        {
           
            channel.sendMessage("실험"+user.getName()).queue();
        }
        else if (msg.equals("주사위"))
        {
            Random rand = new Random();
            int roll = rand.nextInt(6) + 1; 
            channel.sendMessage("Your roll: " + roll).queue(sentMessage ->  
            {                                                             
                if (roll < 3)
                {
                    channel.sendMessage("The roll for messageId: " + sentMessage.getId() + " wasn't very good... Must be bad luck!\n").queue();
                }
            });
        }else if(msg.equals("두팀나누기")) {
        	
        	channel.sendMessage("").queue(); 
           }
    	}
   
    
    }
//{
//    public static void main( String[] args ) throws LoginException, IllegalArgumentException, InterruptedException, RateLimitedException
//    {
//       JDA bot= new JDABuilder(AccountType.BOT).setToken("MzgzNTMzMjAyMDQ5OTkwNjU3.DPlo3A.tbZfbGlH5uSF5Lb2vXi05yhqiRI").buildBlocking();
//       bot.addEventListener(new App());
//    }
//    @Override
//    public void onMessageReceived(MessageReceivedEvent e) {
//    	Message msg=e.getMessage();	//챗팅창 메세지
//    	MessageChannel Channel=e.getChannel(); 	// 채널 챗팅창 
//    	User user =e.getAuthor();	//유저 
//    	
//    	if(msg.getContent().equals("ㅎ2")) {
//    		Channel.sendMessage("ㅎ2,"+user.getAsMention()+"!").queue();
//    		Channel.sendMessage("ㅎ2,"+user.toString()+"!").queue();
//    	}
//    	if(msg.getContent().equals("실험")) {
//    		Channel.sendMessage(
//					"server: " + msg.getChannel().getName() +
//							",name: " + msg.getAuthor().getName() +
//							",content: " + msg.getContent()).queue();
//    		//System.out.println();
////				Channel.sendMessage("뭐해 "+user.getName()+"!").queue();
////				if(msg.getContent().equals("뭐해 ")) {
////				Channel.sendMessage("실험,"+user.getName()+"!").queue();
////				}
//
//    	}
//    	if(msg.getContent().contains("바보")) {
//    		Channel.sendMessage(user.getAsMention()+"바봌ㅋㅋㅋ").queue();
//    	}
//    	
//    	if(e.isFromType(ChannelType.TEXT)) {
//    		Guild guild = e.getGuild();
//    		TextChannel textChannel = e.getTextChannel();
//    		Member member = e.getMember();  
//    		
//    		
//    		
//    		
//    	}
//    	if (msg.getContent().equals("/주사위"))
//        {           
//
//            Random rand = new Random();
//            int roll = rand.nextInt(6) + 1; //This results in 1 - 6 (instead of 0 - 5)
//            Channel.sendMessage("Your roll: " + roll).queue();
//
//        }
//    	if(msg.getContent().equals("팀나누기")) {{
//    		Random rand = new Random();  
//    		String 첫번째팀=null;
//    		String 두번째팀=null;
//    		String 세번째팀=null;
//    		Channel.sendMessage("팀을 몇개나 나눌겁니까? 현재 2개,3개 밖에안됨").queue();
//    		if(msg.getContent().equals("2개")){
//    			Channel.sendMessage("참가를 쳐주십시오").queue();
//    			for(int a=0;;) {
//    			if(msg.getContent().equals("참가")) {
//    				Channel.sendMessage(user.getName()+"님 확인").queue();
//    				int i =rand.nextInt(10);
//    				if(i%2==0) {
//    					첫번째팀+=user.getName();
//    				}else {
//    					두번째팀+=user.getName();
//    				}
//    				   				   				
//    			}
//    			if(msg.getContent().equals("끝")) {
//    				Channel.sendMessage(첫번째팀).queue();
//    				Channel.sendMessage(두번째팀).queue();
//    				break;
//    			}
//    		}
//    			}
//    		}
//    		
//    		
//    		
//    	}
//    	
//    	
//    	
//    	
//    }
//}
