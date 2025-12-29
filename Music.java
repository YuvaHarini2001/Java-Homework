import java.util.Scanner;
class Music
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Spotify Welcomes You");
		System.out.println("1. A.R.Rahman");
		System.out.println("2. Anirudh");
		System.out.println("3. Harish Jeyaraj");
		System.out.println("4.Illaiyaraja");
		System.out.println("5.U1");
		System.out.print("Select Your Choice:");
		
		int Choice = sc.nextInt();
		
		if(Choice==1)
		{
			System.out.println("A.R.Rahman");
			System.out.println("1. Melody");
			System.out.println("2. Kuthu");
			System.out.println("3. Motivational");
			System.out.println("4. Sad");
			System.out.print("Select your Type:");
			
			int Type = sc.nextInt();
			
			if(Type==1)
			{
				System.out.println("Melody");
				System.out.println("1. netru illadha matram");
				System.out.println("2. enna solla pogirai");
				System.out.println("3. ennavale adi ennavale");
				System.out.println("4. malargale malargale");
				System.out.print("Select Your Option:");
				
				int Option = sc.nextInt();
				
				if(Option==1)
				{
					System.out.println("netru illadhamatram");
				}
				else if(Option==2)
				{
					System.out.println("enna solla pogirai");
				}
				else if(Option==3)
				{
					System.out.println("ennavale adi ennavale");
				}
				else if(Option==4)
				{
					System.out.println("malargale malargale");
				}
			    else
				{
					System.out.println("Invalid Melody");
				}
			}
			else if(Type==2)
			{
				System.out.println("Kuthu");
				System.out.println("1. thaiya thaiya");
				System.out.println("2. mukkala mukkabala");
				System.out.println("3. urvashi urvashi");
				System.out.println("4. aathichudi");
				System.out.print("Select Your Choise:");
					
				int Choise = sc.nextInt();
					
				if(Choise==1)
				{
					System.out.println("thaiya thaiya");
				}
				else if(Choise==2)
				{
					System.out.println("mukkala mukkabala");
				}
				else if(Choise==3)
				{
					System.out.println("urvashi urvashi");
				}
				else if(Choise==4)
				{
					System.out.println("aathichudi");
				}
				else 
				{
					System.out.println("Invalid Kuthu");
				}
			}
		    else if(Type==3)
			{
				System.out.println("Motivational");
				System.out.println("1. vande mataram");
				System.out.println("2. oruvan oruvan mudhalli");
				System.out.println("3. Shakthi kodu");
				System.out.println("4. kappal yeari poyachu");
				System.out.print("Select Your Song:");
						
				int Song = sc.nextInt();
						
				if(Song==1)
				{
					System.out.println("vande mataram");
				}
				else if(Song==2)
				{
					System.out.println("oruvan oruvan mudhalli");
				}
				else if(Song==3)
				{
					System.out.println("shakthi kodu");
				}
				else if(Song==4)
				{
					System.out.println("kappal yeari poyachu");
				}
				else 
				{
					System.out.println("Invalid Motivational");
				}
			}
		    else if(Type==4)
			{
			    System.out.println("Sad");
				System.out.println("1. poongatrile");
				System.out.println("2. marudhani");
				System.out.println("3. minnalea en vazhvin");
				System.out.println("4. rasathi");
				System.out.println("5. oru poiyavathu sol");
				System.out.print("Select Your Music:");
							
				int Music = sc.nextInt();
							
				if(Music==1)
				{
					System.out.println("poongatrile");
				}
				else if(Music==2)
				{
					System.out.println("marudhani");
				}
				else if(Music==3)
				{
					System.out.println("minnalea en vazhvin");
				}
				else if(Music==4)
				{
					System.out.println("rasathi");
			    }
			    else if(Music==5)
				{
					System.out.println("oru poiyavathu sol");
				}
				else 
				{
				    System.out.println("Invalid Sad");
				}
			}
				
			else 
			{
				System.out.println("Invalid A.R. Rahman");
			}
		}
		    
		else if(Choice==2)
		{
			System.out.println("Anirudh");
			System.out.println("1. Melody");
			System.out.println("2. Kuthu");
		    System.out.println("3. Motivational");
			System.out.println("4. Sad");
			System.out.print("Select Your Play:");
								
			int Play = sc.nextInt();
								
			if(Play==1)
			{
				System.out.println("Melody");
				System.out.println("1. neeyum nanum anbe");
				System.out.println("2. velicha poove");
				System.out.println("3. po indru neeyaga");
				System.out.println("4. nee partha vizhigal");
				System.out.print("Select Your Song1:");
									
				int Song1 = sc.nextInt();
									
				if(Song1==1)
				{
					System.out.println("neeyum nanum anbe");
				}
				else if(Song1==2)
				{
					System.out.println("velicha poove");
				}
				else if(Song1==3)
				{
					System.out.println("po indru neeyaga");
				}
				else if(Song1==4)
				{
					System.out.println("nee partha vizhigal");
				}
				else
				{
					System.out.println("Invalid Melody");
				}
			}
			else if(Play==2)
			{
			    System.out.println("Kuthu");
				System.out.println("1. vaathi raid");
				System.out.println("2. naa ready");
				System.out.println("3. badass");
				System.out.println("4. vandha edam");
				System.out.println("Select Your S:");
										
				int S = sc.nextInt();
										
				if(S==1)
				{
				    System.out.println("vaathi raid");
				}
				else if(S==2)
			    {
					System.out.println("naa ready");
				}
				else if(S==3)
				{
					System.out.println("badass");
				}
				else if(S==4)
				{
					System.out.println("vandha edam");
			    }
				else
				{
					System.out.println("Invalid Kuthu");
				}
			}
			else if(Play==3)
			{
				System.out.println("Motivational");
			    System.out.println("1. velai illa pattathari");
				System.out.println("2. boomi enna suthudhe");
				System.out.println("3. ethir neechal");
				System.out.println("4. surviva");
				System.out.print("Select Your Mood:");
				int Mood = sc.nextInt();
				if(Mood==1)
				{
					System.out.println("velai illa pattathari");
				}
			    else if(Mood==2)
				{
				    System.out.println("boomi enna suthudhe");
				}
				else if(Mood==3)
				{
					System.out.println("ethir neechal");
				}
				else if(Mood==4)
				{
					System.out.println("surviva");
				}
				else
				{
					System.out.println("Invalid Motivational");
				}
			}
			else if(Play==4)
			{
				System.out.println("Sad");
				System.out.println("1. porkanda singam");
				System.out.println("2. kanave kanave");
				System.out.println("3. kannaana kanne");
				System.out.println("4. jodi nilave");
				System.out.print("Select Your Wish:");
				int Wish = sc.nextInt();
				if(Wish==1)
				{
					System.out.println("porkanda singam");
			    }
				else if(Wish==2)
				{
					System.out.println("kanave kanave");
				}
				else if(Wish==3)
				{
					System.out.println("kannaana kanne");
				}
			    else if(Wish==4)
			    {
					System.out.println("jodi nilave");
				}
				else 
				{
					System.out.println("Invalid Sad");
				}
			}
				
			else 
			{
				System.out.println("Invalid Anirudh");
			}
		}

		else if(Choice==3)
		{
			System.out.println("Harish Jeyaraj");
			System.out.println("1. Melody");
			System.out.println("2. Kuthu");
			System.out.println("3. Sad");
			System.out.println("Select Your List:");
			int List = sc.nextInt();
			if(List==1)
			{
				System.out.println("Melody");
				System.out.println("1. unnale");
				System.out.println("2. annul maele");
				System.out.println("3. yedho ondru");
				System.out.println("4. vaseegara");
				System.out.println("5. paartha mudhal");
				System.out.println("Select Your S3:");
				int S3 = sc.nextInt();
				if(S3==1)
				{
					System.out.println("unnale");
				}
				else if(S3==2)
				{
					System.out.println("annul maele");
				}
				else if(S3==3)
				{
					System.out.println("yedho ondru");
				}
				else if(S3==4)
				{
					System.out.println("vassegara");
				}
				else if(S3==5)
				{
					System.out.println("paartha mudhal");
				}
				else 
				{
					System.out.println("Invalid Melody");
				}
			}
			else if(List==2)
			{
				System.out.println("Kuthu");
				System.out.println("1. tirunelveli halwa da");
				System.out.println("2. aradi katre");
				System.out.println("3. soda bottle");
				System.out.println("4. aruva meesal");
				System.out.print("Select Your K:");
				int K = sc.nextInt();
				if(K==1)
				{
					System.out.println("tirunelveli halwa da");
				}
				else if(K==2)
				{
					System.out.println("aradi katre");
				}
				else if(K==3)
				{
					System.out.println("soda bottle");
				}
				else if(K==4)
				{
					System.out.println("aruva meesal");
				}
				else
				{
				System.out.println("Invalid Kuthu");
				}
			}
		    else if(List==3)
			{
				System.out.println("Sad");
				System.out.println("1. venmathiye");
				System.out.println("2. oh maname");
				System.out.println("3. yamma yamma");
				System.out.println("4. othayile");
				System.out.print("Select Your T:");
				int T = sc.nextInt();
				if(T==1)
				{
					System.out.println("venmathiye");
				}
				else if(T==2)
				{
					System.out.println("oh maname");
				}
				else if(T==3)
				{
					System.out.println("yamma yamma");
				}
			    else if(T==4)
				{
					System.out.println("othayile");
				}
				else
				{
					System.out.println("Invalid Sad");
				}
			}

			else 
			{
				System.out.println("Invalid Harish Jeyaraj");
			}
		}
	        
		else if(Choice==4)
		{
			System.out.println("Illaiyaraja");
			System.out.println("1. Melody");
			System.out.println("2. Kuthu");
			System.out.println("3. Sad");
			System.out.print("Selevt Your S4:");
			int S4 = sc.nextInt();
			if(S4==1)
			{
				System.out.println("Melody");
				System.out.println("1. oru kili uruguthu");
				System.out.println("2. kuzhaloodhum kannanukku");
				System.out.println("3. ennai thottu");
				System.out.println("4. raja raja cholan");
				System.out.print("Select Your F:");
				int F = sc.nextInt();
			    if(F==1)
				{
					System.out.println("oru kili uruguthu");
				}
				else if(F==2)
				{
					System.out.println("kuzhzloodhum kannanukku");
				}
			    else if(F==3)
				{
					System.out.println("ennai thottu");
				}
			    else if(F==4)
				{
					System.out.println("raja raja cholan");
				}
				else 
				{
					System.out.println("Invalid Melody");
				}
			}
		    else if(S4==2)
			{
				System.out.println("Kuthu");
				System.out.println("1. ooruvittu ooruvanthu");
				System.out.println("2. nooru varusham");
				System.out.println("3. aasai nooruvagai");
				System.out.println("4. aasai athigam vachu");
				System.out.print("Select Your D:");
				int D = sc.nextInt();
				if(D==1)
				{
					System.out.println("ooruvittu ooruvanthu");
				}
				else if(D==2)
				{
					System.out.println("nooru varusham");
				}
				else if(D==3)
				{
					System.out.println("aasai nooruvagai");
				}
			    else if(D==4)
				{
					System.out.println("aasai athigam vachu");
				}
				else 
				{
					System.out.println("Invalid Kuthu");
				}
			}
			else if(S4==3)
			{
				System.out.println("Sad");
				System.out.println("1. kanne kalaimane");
				System.out.println("2. thene thenpaandi neeye");
				System.out.println("3. paadi parantha killi");
				System.out.println("4. nilave vaa");
				System.out.print("Select Your X:");
				int X = sc.nextInt();
				if(X==1)
				{
					System.out.println("kanne kalaimane");
				}
				else if(X==2)
				{
					System.out.println("thene thenpaandi neeye");
				}
				else if(X==3)
				{
					System.out.println("paadi parantha killi");
				}
			    else if(X==4)
				{
					System.out.println("nilave vaa");
				}
			    else
				{
					System.out.println("Invalid Sad");
				}
			}
				
			else 
			{
				System.out.println("Invalid Illaiyaraja");
			}
		}
		   
		else if(Choice==5)
		{
			System.out.println("U1");
			System.out.println("1. Melody");
			System.out.println("2. Kuthu");
			System.out.println("3. Motivational");
			System.out.println("4. Sad");
			System.out.print("Select Your List1:");
			int List1 = sc.nextInt();
			if(List1==1)
			{
				System.out.println("Melody");
				System.out.println("1. aathadi manasudhan");
				System.out.println("2. chinna sirisu");
				System.out.println("3. venmeggam");
				System.out.println("4. iayyayyo");
				System.out.print("Select Your Option1:");
				int Option1 = sc.nextInt();
				if(Option1==1)
				{
					System.out.println("aathadi manasudhan");
				}
				else if(Option1==2)
				{
					System.out.println("chinna sirisu");
				}
				else if(Option1==3)
				{
					System.out.println("venmeggam");
				}
			    else if(Option1==4)
				{
					System.out.println("iayyayyo");
				}
				else
				{
					System.out.println("Invalid Melody");
				}
			}
			else if(List1==2)
			{
				System.out.println("Kuthu");
				System.out.println("1. machi open the bottle");
				System.out.println("2. saroja saman nikalo");
				System.out.println("3. no money no honey");
				System.out.println("4. villaiyadu mankatha");
				System.out.print("Select Your Option5:");
				int Option5 = sc.nextInt();
				if(Option5==1)
				{
					System.out.println("machi open the bottel");
				}
				else if(Option5==2)
				{
					System.out.println("saroja saman nikalo");
				}
			    else if(Option5==3)
				{
					System.out.println("no money no honey");
				}
				else if(Option5==4)
				{
					System.out.println("villaiyadu mankatha");
				}
				else
				{
					System.out.println("Invalid Kuthu");
				}
			}
	        else if(List1==3)
			{
				System.out.println("Motivational");
				System.out.println("1. edhirthu nill");
				System.out.println("2. oru nalil");
				System.out.println("3. nimirnthu nil");
				System.out.println("4. ungakkule mirugam");
				System.out.print("Select Your Option8:");
				int Option8 = sc.nextInt();
			    if(Option8==1)
				{
					System.out.println("edhirthu nill");
				}
				else if(Option8==2)
				{
					System.out.println("oru nalil");
				}
				else if(Option8==3)
				{
					System.out.println("nimirnthu nil");
				}
				else if(Option8==4)
				{
					System.out.println("ungakkule mirugam");
				}
				else
				{
					System.out.println("Invalid Motivational");
				}
			}
		   else if(List1==4)
			{
				System.out.println("sad");
				System.out.println("1. kadhal valarthen");
				System.out.println("2. yedho ondru ennai");
				System.out.println("3. pogadhe");
				System.out.println("4. ninaithu ninaithu");
				System.out.print("Select Your Option7:");
				int Option7 = sc.nextInt();
				if(Option7==1)
				{
					System.out.println("kadhal valarthen");
				}
				else if(Option7==2)
				{
					System.out.println("yedho ondru ennai");
				}
				else if(Option7==3)
				{
					System.out.println("pogadhe");
				}
				else if(Option7==4)
				{
					System.out.println("ninaithu ninaithu");
				}
				else
	
		       {
			        System.out.println("Invalid Sad");
		       }
			}
			  
		    else 
			{
				System.out.println("Invalid U1");
			}
		}
			
		else 
		{
			System.out.println("Thank You For Using Me");
		}
	}
}