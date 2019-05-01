package main;



import java.io.File;
import java.util.Scanner;
import static main.Battle.option;
import static main.Enemy.getEnemyHP;
import static main.Player.playerLEVEL;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.embed.swing.JFXPanel;

public abstract class Game extends Player implements Engine{
    
    // ITEM LIST 
    // Weapons
    int sword1 = 1;
    int sword2 = 2;
    int sword3 = 3;
    int staff1 = 1;
    int staff2 = 2;
    int staff3 = 3;
    int bow1 = 1;
    int bow2 = 2;
    int bow3 = 3;
    //Armors
    int light_armor1 = 1;
    int light_armor2 = 2;
    int medium_armor1 = 1;
    int medium_armor2 = 2;
    int heavy_armor1 = 1;
    int heavy_armor2 = 2;
    //Consumables
    int redpot = 1;
    int food = 1;
    
    
    
    Scanner input = new Scanner(System.in);
    
    @Override
    public void playerHelp(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Rpg Battle Simulator V1!");
        System.out.println("This is a very usefull combat system prototype.You can easily implement it in your game.");
        System.out.println("While you are testing this combat system, you are going to play as a knight.");
        System.out.println("Are you ready to start ?");
        System.out.println("1) Start Game");
        System.out.println("2) Exit Game");
        int option=input.nextInt();
        System.out.println("");
        if(option ==1){
            gameStart();    
        }
        else {
            System.exit(1);
        }
    }
    @Override
    public void gameStart(){
         final JFXPanel fxPanel = new JFXPanel();
        String bip = "2.mp3";
        Media hit = new Media(new File(bip).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(hit);
        mediaPlayer.play();
        
        System.out.println("Ebara Krallığı. Beş krallık arasındaki en verimli ovalara ve en geniş topraklara sahip olan krallık. ");
        System.out.println("Ağırlıklı olarak tarım ve hayvancılıkla uğraşan bu krallık, diğer krallıklar ile barış içerisinde  ");
        System.out.println("yaşayan ve onlar ile aktif olarak ticaret yapan bir ülkedir. ");
        System.out.println("Ancak bu ülkeyi diğer ülkelerden üstün kılan bir özelliği vardır ki, o da sihirdir.");
        System.out.println("Sihrin yaklaşık birkaç sene önce Ebara'da ortaya çıkmasıyla, tüm dünyaya ismini duyurur.");
        System.out.println("Ebara artık birçok kişinin ziyaret ettiği uğrak bir krallık haline gelmiştir.");
        System.out.println("");
        System.out.println("1) Okumaya devam et...");
        int option=input.nextInt();
        System.out.println("");
        
        
        if(option >= 0){ 
            System.out.println("Ancak bu ziyaretler her zaman iyi yönde gerçekleşmedi. Tüm ülkede büyüyen ve genişleyen sihir, ");
            System.out.println("daha önce bu topraklarda görülmemiş yaratıklara da davetiye çıkardı.");
            System.out.println("");
        }
        else {
            System.out.println("Ancak bu ziyaretler her zaman iyi yönde gerçekleşmedi. Tüm ülkede büyüyen ve genişleyen sihir, ");
            System.out.println("daha önce bu topraklarda görülmemiş yaratıklara da davetiye çıkardı.");
            System.out.println("");
        }
        
        System.out.println("1) Okumaya devam et...");
        int option2=input.nextInt();
        System.out.println("");
        
        if(option2 >= 0){ 
            System.out.println("İlk kez o zaman görüldü Ebara'nın kâbusu...");
            System.out.println("Bahar mevsiminin sonunda tüm yıl ekimiyle uğraştıkları hasatlarını toplamaya giden Meldev kasabası çiftçileri ");
            System.out.println("bulutların arasından çıkan kanatlı felaket ile karşılaştılar. ");
            System.out.println("Bu yaratık kanatlarını açtığında güneş ışığını adeta perdeleyen simsiyah bir ejderhaydı. ");
            System.out.println("Savunmasız yakalanan Meldev için hiçbir umut yoktu... ");
            System.out.println("Ejderha Meldev'i yeryüzünden silmişti. ");
            System.out.println("Nereden geldiği veya amacının ne olduğunu bilinmeyen Kanatlı felaketi avlamak için elit bir şövalye grubu kuruldu. ");
            System.out.println("");
        }
        else {
            System.out.println("İlk kez o zaman görüldü Ebara'nın kâbusu...");
            System.out.println("Bahar mevsiminin sonunda tüm yıl ekimiyle uğraştıkları hasatlarını toplamaya giden Meldev kasabası çiftçileri ");
            System.out.println("bulutların arasından çıkan kanatlı felaket ile karşılaştılar. ");
            System.out.println("Bu yaratık kanatlarını açtığında güneş ışığını adeta perdeleyen simsiyah bir ejderhaydı. ");
            System.out.println("Savunmasız yakalanan Meldev için hiçbir umut yoktu... ");
            System.out.println("Ejderha Meldev'i yeryüzünden silmişti. ");
            System.out.println("Nereden geldiği veya amacının ne olduğunu bilinmeyen Kanatlı felaketi avlamak için elit bir şövalye grubu kuruldu. ");
            System.out.println("");
        }
        
        System.out.println("1) Okumaya devam et...");
        int option3=input.nextInt();
        System.out.println("");
        
        if(option3 >= 0){ 
            System.out.println("Bu şövalye grubu'nun ismi Dark Veil'di. En cesur ve tecrübeli silahtarların oluşturduğu bu birlik, ");
            System.out.println("aslen süvarilerden oluşup, birlikte yolculuk etmektedirler. ");
            System.out.println("Dark Veil, bizzat Ebara Kralı Myrza tarafından özenle seçilen bu askerler, ");
            System.out.println("Ebara'nın kabusu isimli bu ejderhayı avlamakla görevlendirilmiştir.");
            System.out.println("Ancak yaratığın ülkeye gelişinden yalnızca birkaç ay sonra onu avlamak için yola çıkan birlikten bir daha haber alınamamıştır.");
            System.out.println("");
        }
        else {
            System.out.println("Bu şövalye grubu'nun ismi Dark Veil'di. En cesur ve tecrübeli silahtarların oluşturduğu bu birlik, ");
            System.out.println("aslen süvarilerden oluşup, birlikte yolculuk etmektedirler. ");
            System.out.println("Dark Veil, bizzat Ebara Kralı Myrza tarafından özenle seçilen bu askerler, ");
            System.out.println("Ebara'nın kabusu isimli bu ejderhayı avlamakla görevlendirilmiştir.");
            System.out.println("Ancak yaratığın ülkeye gelişinden yalnızca birkaç ay sonra onu avlamak için yola çıkan birlikten bir daha haber alınamamıştır.");
            System.out.println("");
        }
        System.out.println("1) Okumaya devam et...");
        int option4=input.nextInt();
        System.out.println("");
        
        if(option4 >= 0){ 
            System.out.println("İşte böyle bir zamanda. Krallığın en yardıma ihtiyacı olduğu zamanda Kral Myrza,");
            System.out.println("dört bir tarafında ki maceracılara bir mektup yazdı. Kral, bu mektupta şu sözleri sarf ediyordu. ");
            System.out.println("''Ebara Krallığının Yiğit Maceracıları! ");
            System.out.println("Ebara'nın hiç olmadığı kadar yardıma ihtiyacı var. Göklerden gelip topraklarımızı yağmalayan ");
            System.out.println("karanlık yaratığı yok etmek amacıyla krallığına hizmet etmek isteyen her maceracıyı ");
            System.out.println("bir an önce krallığımıza çağırıyorum. Teklifimi değerlendiren maceracılar cömertçe ödüllendirilecektir.");
            System.out.println("");
        }
        else {
            System.out.println("İşte böyle bir zamanda. Krallığın en yardıma ihtiyacı olduğu zamanda Kral Myrza,");
            System.out.println("dört bir tarafında ki maceracılara bir mektup yazdı. Kral, bu mektupta şu sözleri sarf ediyordu. ");
            System.out.println("''Ebara Krallığının Yiğit Maceracıları! ");
            System.out.println("Ebara'nın hiç olmadığı kadar yardıma ihtiyacı var. Göklerden gelip topraklarımızı yağmalayan ");
            System.out.println("karanlık yaratığı yok etmek amacıyla krallığına hizmet etmek isteyen her maceracıyı ");
            System.out.println("bir an önce krallığımıza çağırıyorum. Teklifimi değerlendiren maceracılar cömertçe ödüllendirilecektir.");
            System.out.println("");
        }
        mediaPlayer.stop();
        
        System.out.println("--- KARAKTER YARATMA BÖLÜMÜ ---");
        System.out.println("Karakteriniz ismini girin: ");
        String characterName = input.next();
        System.out.println("Oynamak istediğiniz class'ı seçin:");
        System.out.println("1) Knight");
        System.out.println("2) Rogue");
        System.out.println("3) Mage");
        int optionClass = input.nextInt();
        
        if(optionClass == 1){
            /*System.out.println("You chose to play as a knight.");
            Knight newKnight = new Knight(); 
            newKnight.setPlayerKnight();
            
            System.out.println("Your HP: "+getPlayerHP() );
            System.out.println("Your STR: "+getPlayerSTR() );
            System.out.println("Your DEX: "+getPlayerDEX() );
            System.out.println("Your AGI: "+getPlayerAGI() );
            System.out.println("Your LEVEL: "+getPlayerLEVEL());
            System.out.println("Your EXP: "+getPlayerEXP());
            System.out.println("PLAYER CD1=8 :" +getPlayerSkillCD());
            System.out.println("SKIL DESC : "+getPlayerSkillDesc());
          */
            System.out.println("-----YENİ KARAKTER-----");
            Player knight = new Knight("ali", 1, 1000, 99, 10, 5, 
                "Battle Stomp", "You deal directly 10 damage and knock down enemy for 1 turn.", 10,
                "Crippling Blow", "Cripple the target with a sweeping blow.Deals 5 physical damage.", 4, 
                "Enrage", "Motivate yourself with the power of rage. You gain 5 STR and do basic attack.", 5, 
                "Phoenix Dive", "You deal 5 more damage.", 6, 
                1, // LEVEL
                0,
                inventory, 
                equipped
            );

            knight.print();
            System.out.println("KNIGHT STR: "+knight.getPlayerSTR());
           knight.inventory = new int[3];
            knight.inventory[0] = sword1;
            if(inventory[0] == sword1){
                knight.setPlayerSTR(playerSTR+5);
            }
            System.out.println("ITEMI GIYDIKTEN SONRA STR: "+ knight.getPlayerSTR());
                    
                    int hp,str,dex,agi;
                    String name;
                    System.out.println("KNIGHT CD1 =10 : " +knight.getPlayerSkillCD());
                    System.out.println("SKILL DESC: "+knight.getPlayerSkillDesc());
               
         System.out.println("Now, you have to create an enemy.");
        
        System.out.println("1) Enter enemy's name:");
        name = input.next();
                        
        System.out.println("2) Enter enemy's HP:");
        hp = input.nextInt();
                    
        System.out.println("3) Enter enemy's STR:");
        str = input.nextInt();
        
        System.out.println("4) Enter enemy's DEX:");
        dex = input.nextInt();
        
        System.out.println("5) Enter enemy's AGI:");
        agi = input.nextInt();
                
        Enemy trainingENEMY1 = new Enemy(1,name,hp,str,dex,agi);
        System.out.println("MOB ADI: "+trainingENEMY1.getEnemyName());
        System.out.println("MOB HP : "+trainingENEMY1.getEnemyHP());
        System.out.println("MOB STR: "+trainingENEMY1.getEnemySTR());
        System.out.println("MOB DEX: "+trainingENEMY1.getEnemyDEX());
        System.out.println("MOB DEX: "+trainingENEMY1.getEnemyAGI());
        System.out.println("BATTLE IS STARTED!");
        Battle newBattle = new Battle();
        newBattle.createBattle();
            
    
        }
        else if(optionClass == 2){
            
        }
        else if(optionClass == 3){
            
        }
        else {
            System.out.println("Yanlış seçim yaptınız!");
        }
        
        System.out.println("CHAPTER 1 - ORMANDAKİ SIR");
        System.out.println("Güney Palamut Ormanı her zamanki gibi tertemiz ve yeşil ağaçlar ile kaplı bir yer olmuştu.");
        System.out.println("Yüksek ve sık palamut ağaçlarından ismini alan orman, yerleşime uzak olmasından kaynaklanacak ki");
        System.out.println("ki hayvan çeşidinden oldukça zengin bir yerdi. Özellikle geyiklerin yaşadığı bu ormanda avcılık ");
        System.out.println("ile geçinen avcıları ve etleri stokladıkları kulübeleri görmek oldukça mümkündü. ");
        System.out.println("Tabi şu sıralar av mevsiminin olmamasından dolayı kulübeler boştu ve yerlerini türlü canlılara bırakmışlardı. ");
        System.out.println("");
        System.out.println("1) Okumaya devam et...");
        System.out.println("");
        
        System.out.println(characterName + ", yarım saattir yaralı bir geyiğin peşindeydi. Bu zorlu kışı atlatmak her geçen gün zorlaşıyordu. Bu yüzden geyiği yakalaması şarttı.");
        System.out.println("Geyikten arta kalanlar olursa ne yapacağını düşünüyordu "+characterName+" ki tam bu sırada topraktaki izleri fark etti. ");
        System.out.println("İzler dikkatlice incelendiğinde bunların yeni olduğu çok çabuk belli oluyordu. ");
        System.out.println("Ancak bu izlerde bir farklılık vardı. İzler geyiğinkine hiç benzemiyordu. Bunlar başka bir yaratığa ait olmalıydı. ");
        System.out.println("");
        System.out.println("1) İzleri araştır");
        System.out.println("2) Geyik izlerini takip et");
        System.out.println("3) Bölgeye tuzak kurup ilerleyen saatlerde kontrole gel");
        System.out.println("");
        int firstStoryOption = input.nextInt();
        if(firstStoryOption == 1){
            System.out.println(characterName+" neyin peşinde olduğunu bilmiyordu. Bu yüzden temkinli gitmeye karar verdi ve silahını kullanıma hazır duruma getirdi. ");
            System.out.println("1) SİLAH 1");
            System.out.println("2) silah 2");
            System.out.println("3) silah 3");
            System.out.println("");
            int selectweapon=input.nextInt();
            if(selectweapon == 1){
                
            }
            else if(selectweapon == 2){
                
            }
            else if(selectweapon == 3){
                
            }
                
            System.out.println("Güney Palamut Ormanının derinlikleri her zaman karanlık ve gizemli olmuştur. Avcılık süresi boyunca "+characterName+" , buraya hiç gelmemişti.");
            System.out.println("Korktuğundan değil ancak derinliklerde farklı canlıların yaşadığından emin olup onları rahatsız etmemenin doğru olduğunu düşünmüştü. ");
            System.out.println("Ta ki bu izleri görene kadar...");         
            System.out.println("1) İzleri takip etmeye devam et ");
            System.out.println("2) Geyik izlerini aramaya dön");
            System.out.println("3) Ormanın derinleri güvenli değil, kulübene geri dön");
            System.out.println("");
            int firstStorySubOption1 = input.nextInt();
            System.out.println("");
            if(firstStorySubOption1 == 1){
                System.out.println("Ormanın bu bölümü yüksek ağaçların yaprakları yüzünden güneş ışıklarının ancak tel tel girebildiği");
                System.out.println("için oldukça karanlık görünüyordu. Etraftaki kuş cıvıltılarının iyice azalması etraftaki atmosferi daha da");
                System.out.println("gergin hâle getirmişti. Yapraklar ve çalılar ufak bir meltemle hışırdamaktaydı. Bir süredir de orman ");
                System.out.println("patikasından ayrılmıştı "+characterName +"Ve izler gittikçe silikleşiyordu.");
                System.out.println("1) İzleri takip etmeyi sürdür");
                System.out.println("2) Etrafı kolaçan etme zamanı");
                System.out.println("3) Patikayı yeniden bul, ormanın derinliklerinden ayrıl");
                System.out.println("4) Bu bölgeye tuzak kurup ilerleyen saatlerde kontrol'e gel");
                int firstStorySubOption11 = input.nextInt();
                if(firstStorySubOption11 == 1){ // tuzak seçeneği için
                    System.out.println(characterName+ "izlerin kısa bir süre sonra onlarca ize dönüşmesini gözlemledi. Bir sürü ufak yaratığın ayak izleriydi bunlar. ");
                    System.out.println("''Goblinler...'' dedi kısık sesle. Bu küçük, sinsi yeşil canavarların gittikleri yerin ilerideki bir mağara olduğu çok açıktı. ");
                    System.out.println("''Lanet yaratıkların ini burada olmalı.''");
                    System.out.println("1) Mağaraya ilerle");
                    System.out.println("2) Çalılarda pusu kur");
                    System.out.println("3) Bu bölgeye tuzak kurup ilerlemeye devam et");
                    System.out.println("4) Patikayı yeniden bul, ormanın derinliklerin ayrıl");
                    int firstStorySubOption111 = input.nextInt();
                    if(firstStorySubOption111==1){
                        System.out.println("Tam ileride ormanın derinliklerinde nispeten ağaçlardan arınmış bir mağara gözüküyordu.");
                        System.out.println("Bu mağaranın genişliği yaklaşık 3 metre boyunda olup neredeyse bir at arabasının geçebileceği düzeydeydi. ");
                        System.out.println("Mağaranın önünde kötü yapılmış birkaç barikat göze çarpıyordu. ");
                        System.out.println("Bakar bakmaz bu barikatların goblin işi olduğunu anlamıştı"+ characterName);
                        System.out.println("Ancak etrafta hiç gözcü olmaması tuhafına gitmişti. Bu durumda;");
                        System.out.println("1) Barikatları parçalayarak içeriye girmenin...");
                        System.out.println("2) Barikatları sessizce bozup içeriye girmenin...");
                        System.out.println("3) Patikayı yeniden bulup, ormanın derinliklerinden ayrılmanın...");
                        System.out.println("... vaktinin geldiğini düşündü.");
                        int firstStorySubOption1111 = input.nextInt();
                        if(firstStorySubOption1111 == 1){
                            System.out.println("Son barikatta parçalanmak üzereyken goblin çığlıkları işiten "+characterName+" silahına davrandı."); //  KESİN ÖLÜM combat olcak
                            System.out.println("Ancak çıkardığı bu gürültü yüzünden çok sayıda goblinle savaşması gerekecekti."); 
                            System.out.println("Bunun kazanamayacağı bir savaş olduğunu çok acı bir şekilde öğrenmek üzereydi.");
                        }
                        else if (firstStorySubOption1111 == 2){
                            System.out.println(characterName+ " barikatları temkinli bir şekilde bozarak mağaranın yolunu açar. ");
                            System.out.println("Bunun ona çok vakit kaybettirdiğini ancak eğer içeride ona tehlike yaratacak bir goblin ");
                            System.out.println("grubu varsa farkında olmayacaklarından emin oldu. Ardından karanlık mağaraya girdi. ");
                            System.out.println("Mağaranın içerisinde ilerledikçe yanında bir aydınlatıcı olmadığı için küfürler eden "+characterName);
                            System.out.println("konuşan goblinlerin seslerini işitene kadar düz yolda ilerledi. Bu karanlıkta herhangi bir şey görmek mümkün değildi.");
                            System.out.println("1) Ses gelen yere saldır.");
                            System.out.println("2) Sessizce yaklaşmayı dene.");
                            System.out.println("3) Mağaradan ayrıl.");
                            int firstStorySubOption11112 = input.nextInt();
                            if(firstStorySubOption11112 == 1){
                                System.out.println(""); // COMBAT VAR 
                                // (Karanlıkta çok dezavantaj alınarak goblinlere sürpriz saldırı yapılınabilir.) 
                                // Goblinlere bu koşullarda saldırmamak gerektiğini öğrenen _________;
                                // combat kazanılırsa
                                System.out.println("1) Mağarada ilerlemeye devam et");
                                System.out.println("2) Mağaradan ayrıl");
                                int firstStorySubOption111121 = input.nextInt();
                                if(firstStorySubOption111121 == 1){
                                    System.out.println("Mağara boyunca ilerledikçe göze titreyen bir ateşin ışığı vurmaktadır. Bu ateş, mağaranın sonundaki geniş salondan geliyordu.");
                                    System.out.println("Salon kısmına ilerleyen "+characterName+" goblinlerin esirlerini tuttukları kafesleri fark eder. ");
                                    System.out.println("Bu kafeslerin biri hariç diğerleri ya boş ya da kemik ve organ parçalarıyla doluydu. ");
                                    System.out.println("Farklı olan kafeste ise işkence görmüş dişi bir figür yatıyordu. ");
                                    System.out.println("Bu figürün insan olmadığı çok açıktı. Alın bölgesinden çıkan boynuzlar ve esmer ten rengi ile bunun bir orman perisi olduğu belli oluyordu.");
                                    System.out.println("Goblinler, avcıyı görür görmez var güçleriyle ona doğru koşup çığlıklar atmaya başlarlar. "); // COMBAT BAŞLAR
                                    System.out.println(characterName+" çatışma sonundahızlı aımlarla perinin olduğu kafese ilerledi.."); //COMBAT BAŞLAR
                                    System.out.println("1)Kafesin kilidini aç");
                                    System.out.println("2)'Hey iyi misin?'");
                                    System.out.println("3)'Hey sen de kimsin?'");
                                    int firstStorySubOption1111211 = input.nextInt();
                                    if(firstStorySubOption1111211 == 1){
                                        System.out.println("Peri kafesin kilidinin açılmasıyla avcıya doğru döndü.");
                                        System.out.println("Yüzü yaralarla dolu olan bu ufak yaratık, tam konuşacağı sırada arkadan gelen goblinlerin çığlıklarını işitip kafesin derinliklerine çekilir. ");
                                        System.out.println(characterName+" daha çok goblin olabileceğinden korkuyordu. ");
                                        System.out.println("Biraz sonra karşılarına çıkacak goblin grubunun avdan dönen bir ekip olabileceğini düşünmemişti ancak.");
                                        System.out.println("Bunun kazanamayacağı bir savaş olduğunu çok acı bir şekilde öğrenmek üzereydi.");// combat yok krakter ölür
                                        
                                    }
                                     else if(firstStorySubOption11112 == 2){
                                         System.out.println("Peri sesi işitir işitmez avcıya doğru döndü.");
                                         System.out.println("Yüzü yaralarla dolu olan bu ufak yaratık, tam konuşacağı sırada arkadan gelen goblinlerin çığlıklarını işitip kafesin derinliklerine çekilir.");
                                         System.out.println(characterName+" daha çok goblin olabileceğinden korkuyordu. Biraz sonra karşılarına çıkacak goblin grubunun avdan dönen bir ekip olabileceğini düşünmemişti ancak.");
                                         System.out.println("Bunun kazanamayacağı bir savaş olduğunu çok acı bir şekilde öğrenmek üzereydi.");// combat yok krakter ölür
                                    }
                                    else if(firstStorySubOption11112 == 3){
                                        System.out.println("Peri kafesin kilidinin açılmasıyla avcıya doğru döndü.");
                                        System.out.println("Yüzü yaralarla dolu olan bu ufak yaratık, tam konuşacağı sırada arkadan gelen goblinlerin çığlıklarını işitip kafesin derinliklerine çekilir.");
                                        System.out.println(characterName+" daha çok goblin olabileceğinden korkuyordu.");
                                        System.out.println("Biraz sonra karşılarına çıkacak goblin grubunun avdan dönen bir ekip olabileceğini düşünmemişti ancak. ");
                                        System.out.println("Bunun kazanamayacağı bir savaş olduğunu çok acı bir şekilde öğrenmek üzereydi.");// combat yok krakter ölür
                    
                                    }
                                            
                                }
                                else if (firstStorySubOption111121 == 2){
                                    System.out.println("Mağaradan ayrılmak için doğru bir karardı.");
                                    System.out.println("Çünkü biraz sonra mağaralarına dönen onlarca goblin gözükecekti.");
                                    System.out.println("Goblinler inlerine dönerken oldukça keyifli görünüyorlardı."); 
                                    System.out.println("Bunun sebebinin yanlarında halatlarla taşıdıkları yaralı bir geyik olmasıydı.");
                                    System.out.println("Avlamaya çalıştığı geyiğin küçük yeşil canavarlar tarafından çalınmasına üzüldü avcı. ");
                                    System.out.println("Eli boş bir şekilde kulübesine doğru yola çıktı.");
                                    System.out.println("UFUK HAZIRLICAK BURAYI");
                                    System.out.println("1) Çalılara pusu kur");
                                    System.out.println("2) Patikayı yeniden bul, ormanın derinliklerinden ayrıl");
                                    int firstStorySubOption111111121 = input.nextInt();
                                    if(firstStorySubOption111111121 == 1){
                                        System.out.println("Ormana gece çöküyordu. Güney Palamut Ormanına vuran ışık süzmelerinin gittikçe kaybolduğu görülüyordu. ");
                                        System.out.println("Ağaçların alt tarafları kararmıştı bile. Sessizlik baykuş ötmeleri ile bozuluyordu. Etrafta dolaşan son börtü böcek ise yuvalarına çekilmek için hazırlık yapmaktaydı. ");
                                        System.out.println(characterName+ " çalıların içinde pusu kurduğu sürece bolca böğürtlen saklandığı çalının içinde. ");
                                        System.out.println("Bunlar ormanın en leziz böğürtlenleri olan yıldız böğürtlenleriydi. ");
                                        System.out.println("Birkaçını ağzına atıp ne kadar iyi olduklarını tekrar onayladı. ");
                                        System.out.println("Saatlerin geçmesine rağmen goblin görememesi canını iyice sıkmıştı.");
                                    }   
                                }
                                else {
                                    
                                }
                            }
                            else if(firstStorySubOption11112 == 2){
                                System.out.println("İşittiği çokça goblin seslerinden sonra, ''Mağaranın içerisi bu yaratıklardan dolup taşıyor.'' dedi "+characterName );
                                System.out.println("''Fark edilmeden önce burayı terk etsem iyi olacak. Buraya hazırlıksız gelmek intihardan farksız.'' diye ekleyip..");
                                System.out.println("1)Mağarada ilerler. ");
                                System.out.println("2)Mağaradan ayrıl.");
                                int firstStorySubOption111122 = input.nextInt();
                                 if(firstStorySubOption111122 == 1){
                                      System.out.println("Mağara boyunca ilerledikçe göze titreyen bir ateşin ışığı vurmaktadır. Bu ateş, mağaranın sonundaki geniş salondan geliyordu.");
                                    System.out.println("Salon kısmına ilerleyen "+characterName+" goblinlerin esirlerini tuttukları kafesleri fark eder. ");
                                    System.out.println("Bu kafeslerin biri hariç diğerleri ya boş ya da kemik ve organ parçalarıyla doluydu. ");
                                    System.out.println("Farklı olan kafeste ise işkence görmüş dişi bir figür yatıyordu. ");
                                    System.out.println("Bu figürün insan olmadığı çok açıktı. Alın bölgesinden çıkan boynuzlar ve esmer ten rengi ile bunun bir orman perisi olduğu belli oluyordu.");
                                    System.out.println("Goblinler, avcıyı görür görmez var güçleriyle ona doğru koşup çığlıklar atmaya başlarlar. "); // COMBAT BAŞLAR
                                    System.out.println(characterName+" çatışma sonundahızlı aımlarla perinin olduğu kafese ilerledi.."); //COMBAT BAŞLAR
                                    System.out.println("1)Kafesin kilidini aç");
                                    System.out.println("2)'Hey iyi misin?'");
                                    System.out.println("3)'Hey sen de kimsin?'");
                                    int firstStorySubOption1111211 = input.nextInt();
                                    if(firstStorySubOption1111211 == 1){
                                        System.out.println("Peri kafesin kilidinin açılmasıyla avcıya doğru döndü.");
                                        System.out.println("Yüzü yaralarla dolu olan bu ufak yaratık, tam konuşacağı sırada arkadan gelen goblinlerin çığlıklarını işitip kafesin derinliklerine çekilir. ");
                                        System.out.println(characterName+" daha çok goblin olabileceğinden korkuyordu. ");
                                        System.out.println("Biraz sonra karşılarına çıkacak goblin grubunun avdan dönen bir ekip olabileceğini düşünmemişti ancak.");
                                        System.out.println("Bunun kazanamayacağı bir savaş olduğunu çok acı bir şekilde öğrenmek üzereydi.");// combat yok krakter ölür     
                                    }
                                    else if(firstStorySubOption11112 == 2){
                                        System.out.println("Peri sesi işitir işitmez avcıya doğru döndü.");
                                        System.out.println("Yüzü yaralarla dolu olan bu ufak yaratık, tam konuşacağı sırada arkadan gelen goblinlerin çığlıklarını işitip kafesin derinliklerine çekilir.");
                                        System.out.println(characterName+" daha çok goblin olabileceğinden korkuyordu. Biraz sonra karşılarına çıkacak goblin grubunun avdan dönen bir ekip olabileceğini düşünmemişti ancak.");
                                        System.out.println("Bunun kazanamayacağı bir savaş olduğunu çok acı bir şekilde öğrenmek üzereydi.");// combat yok krakter ölür
                                    }
                                    else if(firstStorySubOption11112 == 3){
                                        System.out.println("Peri kafesin kilidinin açılmasıyla avcıya doğru döndü.");
                                        System.out.println("Yüzü yaralarla dolu olan bu ufak yaratık, tam konuşacağı sırada arkadan gelen goblinlerin çığlıklarını işitip kafesin derinliklerine çekilir.");
                                        System.out.println(characterName+"daha çok goblin olabileceğinden korkuyordu.");
                                        System.out.println("Biraz sonra karşılarına çıkacak goblin grubunun avdan dönen bir ekip olabileceğini düşünmemişti ancak. ");
                                        System.out.println("Bunun kazanamayacağı bir savaş olduğunu çok acı bir şekilde öğrenmek üzereydi.");// combat yok krakter ölür
                                    }
                                } 
                                else if(firstStorySubOption111122== 2){
                                    System.out.println("Mağaradan ayrılmak için doğru bir karardı.");
                                    System.out.println("Çünkü biraz sonra mağaralarına dönen onlarca goblin gözükecekti.");
                                    System.out.println("Goblinler inlerine dönerken oldukça keyifli görünüyorlardı."); 
                                    System.out.println("Bunun sebebinin yanlarında halatlarla taşıdıkları yaralı bir geyik olmasıydı.");
                                    System.out.println("Avlamaya çalıştığı geyiğin küçük yeşil canavarlar tarafından çalınmasına üzüldü avcı. ");
                                    System.out.println("Eli boş bir şekilde kulübesine doğru yola çıktı.");
                                    System.out.println("UFUK HAZIRLICAK BURAYI");
                                    System.out.println("1) Çalılara pusu kur");
                                    System.out.println("2) Patikayı yeniden bul, ormanın derinliklerinden ayrıl");
                                    int firstStorySubOption111111121 = input.nextInt();
                                    if(firstStorySubOption111111121 == 1){
                                        System.out.println("Ormana gece çöküyordu. Güney Palamut Ormanına vuran ışık süzmelerinin gittikçe kaybolduğu görülüyordu. ");
                                        System.out.println("Ağaçların alt tarafları kararmıştı bile. Sessizlik baykuş ötmeleri ile bozuluyordu. Etrafta dolaşan son börtü böcek ise yuvalarına çekilmek için hazırlık yapmaktaydı. ");
                                        System.out.println(characterName+ " çalıların içinde pusu kurduğu sürece bolca böğürtlen saklandığı çalının içinde. ");
                                        System.out.println("Bunlar ormanın en leziz böğürtlenleri olan yıldız böğürtlenleriydi. ");
                                        System.out.println("Birkaçını ağzına atıp ne kadar iyi olduklarını tekrar onayladı. ");
                                        System.out.println("Saatlerin geçmesine rağmen goblin görememesi canını iyice sıkmıştı.");
                                        System.out.println("1) Yıldız böğürtlenlerini topla");
                                        System.out.println("2) Etrafta öten baykuşun sesini taklit et");
                                        System.out.println("3) Çalıda kalmaya devam et");
                                        System.out.println("4) Patikayı yeniden bul, ormanın derinliklerinden ayrıl");
                                        int calioption = input.nextInt();
                                        if(calioption == 1){
                                            System.out.println("Eh en azından bu gece aç yatmayacağım diye söylendi "+characterName);
                                            System.out.println("Gözleri hâla onu habersizce yakalayabileceği bir goblini arıyordu.");
                                            System.out.println("İstediği birkaç dakika sonra gerçekleşecekti. Çalının yakınlarında İki tane silahsız goblin belirdi.");
                                            System.out.println("Bir şeyi arıyorlar gibi halleri vardı. Avcı bu goblinlerin arkadaşlarını aradığından emin oldu. Saldırmak için çok uygun bir fırsattı. ");
                                            System.out.println("1) Saldır");
                                            System.out.println("2) Saldırma, çalıda kalmaya devam et");
                                            int calioption1 = input.nextInt();
                                            if(calioption1 == 1){
                                                // combat var
                                                System.out.println("Silahını iyice temizleyen "+characterName+" daha fazla buralarda durmanın bir anlamı olmadığını düşünerek bölgeyi terk eder.");
                                                System.out.println("1) Patikayı yeniden bul, ormanın derinliklerinden ayrıl");
                                            }
                                            else if(calioption1 == 2){
                                                // combat yok
                                                System.out.println("Daha fazla buralarda durmanın bir anlamı olmadığını düşünerek bölgeyi terk eder.");
                                                System.out.println("1) Patikayı yeniden bul, ormanın derinliklerinden ayrıl");
                                            }
                                        }
                                        else if(calioption == 2){
                                            System.out.println("sesi taklit et");
                                        }
                                        else if(calioption == 3){
                                            System.out.println("Çalıda kalmaya devam eder!!");
                                        }
                                        else if(calioption == 4){
                                            System.out.println("1) Patikayı yeniden bul, ormanın derinliklerinden ayrıl");
                                        }
                                    }
                                }  
                            }
                            else if( firstStorySubOption11112 == 3){
                                System.out.println("Mağaradan ayrılmak için doğru bir karardı.");
                                System.out.println("Çünkü biraz sonra mağaralarına dönen onlarca goblin gözükecekti.");
                                System.out.println("Goblinler inlerine dönerken oldukça keyifli görünüyorlardı."); 
                                System.out.println("Bunun sebebinin yanlarında halatlarla taşıdıkları yaralı bir geyik olmasıydı.");
                                System.out.println("Avlamaya çalıştığı geyiğin küçük yeşil canavarlar tarafından çalınmasına üzüldü avcı. ");
                                System.out.println("Eli boş bir şekilde kulübesine doğru yola çıktı.");
                                System.out.println("UFUK HAZIRLICAK BURAYI");
                                System.out.println("1) Çalılara pusu kur");
                                System.out.println("2) Patikayı yeniden bul, ormanın derinliklerinden ayrıl");
                                int firstStorySubOption111111121 = input.nextInt();
                                if(firstStorySubOption111111121 == 1){
                                    System.out.println("Ormana gece çöküyordu. Güney Palamut Ormanına vuran ışık süzmelerinin gittikçe kaybolduğu görülüyordu. ");
                                    System.out.println("Ağaçların alt tarafları kararmıştı bile. Sessizlik baykuş ötmeleri ile bozuluyordu. Etrafta dolaşan son börtü böcek ise yuvalarına çekilmek için hazırlık yapmaktaydı. ");
                                    System.out.println(characterName+ " çalıların içinde pusu kurduğu sürece bolca böğürtlen saklandığı çalının içinde. ");
                                    System.out.println("Bunlar ormanın en leziz böğürtlenleri olan yıldız böğürtlenleriydi. ");
                                    System.out.println("Birkaçını ağzına atıp ne kadar iyi olduklarını tekrar onayladı. ");
                                    System.out.println("Saatlerin geçmesine rağmen goblin görememesi canını iyice sıkmıştı.");
                                    System.out.println("1) Yıldız böğürtlenlerini topla");
                                    System.out.println("2) Etrafta öten baykuşun sesini taklit et");
                                    System.out.println("3) Çalıda kalmaya devam et");
                                    System.out.println("4) Patikayı yeniden bul, ormanın derinliklerinden ayrıl");
                                    int calioption = input.nextInt();
                                    if(calioption == 1){
                                        System.out.println("Eh en azından bu gece aç yatmayacağım diye söylendi "+characterName);
                                        System.out.println("Gözleri hâla onu habersizce yakalayabileceği bir goblini arıyordu.");
                                        System.out.println("İstediği birkaç dakika sonra gerçekleşecekti. Çalının yakınlarında İki tane silahsız goblin belirdi.");
                                        System.out.println("Bir şeyi arıyorlar gibi halleri vardı. Avcı bu goblinlerin arkadaşlarını aradığından emin oldu. Saldırmak için çok uygun bir fırsattı. ");
                                        System.out.println("1) Saldır");
                                        System.out.println("2) Saldırma, çalıda kalmaya devam et");
                                        int calioption1 = input.nextInt();
                                        if(calioption1 == 1){
                                            // combat var
                                            System.out.println("Silahını iyice temizleyen "+characterName+" daha fazla buralarda durmanın bir anlamı olmadığını düşünerek bölgeyi terk eder.");
                                            System.out.println("1) Patikayı yeniden bul, ormanın derinliklerinden ayrıl");
                                        }
                                        else if(calioption1 == 2) {
                                            // combat yok
                                            System.out.println("Daha fazla buralarda durmanın bir anlamı olmadığını düşünerek bölgeyi terk eder.");
                                            System.out.println("1) Patikayı yeniden bul, ormanın derinliklerinden ayrıl");
                                        }
                                    }
                                    else if(calioption == 2) {
                                        System.out.println("sesi taklit et");
                                    }
                                    else if(calioption == 3) {
                                        System.out.println("Çalıda kalmaya devam eder!!");
                                    }
                                    else if(calioption == 4) {
                                        System.out.println("1) Patikayı yeniden bul, ormanın derinliklerinden ayrıl");
                                    }
                                }    
                            }               
                        }
                        else if(firstStorySubOption1111 == 3){                          
                            System.out.println("Mağaradan ayrılmak için doğru bir karardı.");
                            System.out.println("Çünkü biraz sonra mağaralarına dönen onlarca goblin gözükecekti.");
                            System.out.println("Goblinler inlerine dönerken oldukça keyifli görünüyorlardı."); 
                            System.out.println("Bunun sebebinin yanlarında halatlarla taşıdıkları yaralı bir geyik olmasıydı.");
                            System.out.println("Avlamaya çalıştığı geyiğin küçük yeşil canavarlar tarafından çalınmasına üzüldü avcı. ");
                            System.out.println("Eli boş bir şekilde kulübesine doğru yola çıktı.");
                            System.out.println("UFUK HAZIRLICAK BURAYI");
                            System.out.println("1) Çalılara pusu kur");
                            System.out.println("2) Patikayı yeniden bul, ormanın derinliklerinden ayrıl");
                            int firstStorySubOption111111121 = input.nextInt();
                            if(firstStorySubOption111111121 == 1){
                                System.out.println("Ormana gece çöküyordu. Güney Palamut Ormanına vuran ışık süzmelerinin gittikçe kaybolduğu görülüyordu. ");
                                        System.out.println("Ağaçların alt tarafları kararmıştı bile. Sessizlik baykuş ötmeleri ile bozuluyordu. Etrafta dolaşan son börtü böcek ise yuvalarına çekilmek için hazırlık yapmaktaydı. ");
                                        System.out.println(characterName+ " çalıların içinde pusu kurduğu sürece bolca böğürtlen saklandığı çalının içinde. ");
                                        System.out.println("Bunlar ormanın en leziz böğürtlenleri olan yıldız böğürtlenleriydi. ");
                                        System.out.println("Birkaçını ağzına atıp ne kadar iyi olduklarını tekrar onayladı. ");
                                        System.out.println("Saatlerin geçmesine rağmen goblin görememesi canını iyice sıkmıştı.");
                                        System.out.println("1) Yıldız böğürtlenlerini topla");
                                        System.out.println("2) Etrafta öten baykuşun sesini taklit et");
                                        System.out.println("3) Çalıda kalmaya devam et");
                                        System.out.println("4) Patikayı yeniden bul, ormanın derinliklerinden ayrıl");
                                        int calioption = input.nextInt();
                                        if(calioption == 1){
                                            System.out.println("Eh en azından bu gece aç yatmayacağım diye söylendi "+characterName);
                                            System.out.println("Gözleri hâla onu habersizce yakalayabileceği bir goblini arıyordu.");
                                            System.out.println("İstediği birkaç dakika sonra gerçekleşecekti. Çalının yakınlarında İki tane silahsız goblin belirdi.");
                                            System.out.println("Bir şeyi arıyorlar gibi halleri vardı. Avcı bu goblinlerin arkadaşlarını aradığından emin oldu. Saldırmak için çok uygun bir fırsattı. ");
                                            System.out.println("1) Saldır");
                                            System.out.println("2) Saldırma, çalıda kalmaya devam et");
                                            int calioption1 = input.nextInt();
                                            if(calioption1 == 1){
                                                // combat var
                                                System.out.println("Silahını iyice temizleyen "+characterName+" daha fazla buralarda durmanın bir anlamı olmadığını düşünerek bölgeyi terk eder.");
                                                System.out.println("1) Patikayı yeniden bul, ormanın derinliklerinden ayrıl");
                                            }
                                            else if(calioption1 == 2){
                                                // combat yok
                                                System.out.println("Daha fazla buralarda durmanın bir anlamı olmadığını düşünerek bölgeyi terk eder.");
                                                System.out.println("1) Patikayı yeniden bul, ormanın derinliklerinden ayrıl");
                                            }
                                        }
                                        else if(calioption == 2){
                                            System.out.println("sesi taklit et");
                                        }
                                        else if(calioption == 3){
                                            System.out.println("Çalıda kalmaya devam eder!!");
                                        }
                                        else if(calioption == 4){
                                            System.out.println("Patikayı ararken acı bir kadın inlemesi duyulur. ''Yardım edin! Buraya sıkıştım. Lütfen yardım edin!'' ");
                                            System.out.println("diye yankılanıyordu ses. Goblinlerin masum bir kadını yakaladığından hiç şüphesi yoktu avcının. ");
                                        }
                            }
                            else if(firstStorySubOption111111121 == 2){
                                System.out.println("Patikayı ararken acı bir kadın inlemesi duyulur. ''Yardım edin! Buraya sıkıştım. Lütfen yardım edin!'' ");
                                System.out.println("diye yankılanıyordu ses. Goblinlerin masum bir kadını yakaladığından hiç şüphesi yoktu avcının. ");
                            }
                        }
                        
                        else {
                        
                        }                                
                    } // tuzak sonu
                    else if (firstStorySubOption111 == 2){
                        System.out.println("Ormana gece çöküyordu. Güney Palamut Ormanına vuran ışık süzmelerinin gittikçe kaybolduğu görülüyordu. ");
                        System.out.println("Ağaçların alt tarafları kararmıştı bile. Sessizlik baykuş ötmeleri ile bozuluyordu. Etrafta dolaşan son börtü böcek ise yuvalarına çekilmek için hazırlık yapmaktaydı. ");
                        System.out.println(characterName+ " çalıların içinde pusu kurduğu sürece bolca böğürtlen saklandığı çalının içinde. ");
                        System.out.println("Bunlar ormanın en leziz böğürtlenleri olan yıldız böğürtlenleriydi. ");
                        System.out.println("Birkaçını ağzına atıp ne kadar iyi olduklarını tekrar onayladı. ");
                        System.out.println("Saatlerin geçmesine rağmen goblin görememesi canını iyice sıkmıştı.");
                        System.out.println("1) Yıldız böğürtlenlerini topla");
                        System.out.println("2) Etrafta öten baykuşun sesini taklit et");
                        System.out.println("3) Çalıda kalmaya devam et");
                        System.out.println("4) Patikayı yeniden bul, ormanın derinliklerinden ayrıl");
                        int calioption = input.nextInt();
                        if(calioption == 1){
                            System.out.println("Eh en azından bu gece aç yatmayacağım diye söylendi "+characterName);
                            System.out.println("Gözleri hâla onu habersizce yakalayabileceği bir goblini arıyordu.");
                            System.out.println("İstediği birkaç dakika sonra gerçekleşecekti. Çalının yakınlarında İki tane silahsız goblin belirdi.");
                            System.out.println("Bir şeyi arıyorlar gibi halleri vardı. Avcı bu goblinlerin arkadaşlarını aradığından emin oldu. Saldırmak için çok uygun bir fırsattı. ");
                            System.out.println("1) Saldır");
                            System.out.println("2) Saldırma, çalıda kalmaya devam et");
                            int calioption1 = input.nextInt();
                            if(calioption1 == 1){
                                // combat var
                                System.out.println("Silahını iyice temizleyen "+characterName+" daha fazla buralarda durmanın bir anlamı olmadığını düşünerek bölgeyi terk eder.");
                                System.out.println("1) Patikayı yeniden bul, ormanın derinliklerinden ayrıl");
                            }
                            else if(calioption1 == 2){
                                // combat yok
                                System.out.println("Daha fazla buralarda durmanın bir anlamı olmadığını düşünerek bölgeyi terk eder.");
                                System.out.println("1) Patikayı yeniden bul, ormanın derinliklerinden ayrıl");
                            }
                        }
                        else if(calioption == 2){
                            System.out.println("sesi taklit et");
                        }
                        else if(calioption == 3){
                            System.out.println("Çalıda kalmaya devam eder!!");
                        }
                        else if(calioption == 4){
                            System.out.println("Patikayı ararken acı bir kadın inlemesi duyulur. ''Yardım edin! Buraya sıkıştım. Lütfen yardım edin!'' ");
                            System.out.println("diye yankılanıyordu ses. Goblinlerin masum bir kadını yakaladığından hiç şüphesi yoktu avcının. ");
                        }
                        // çalılar
                    }
                    else if(firstStorySubOption111 == 3){    
                        // tuzak seçeneği burası
                        System.out.println("Tam ileride ormanın derinliklerinde nispeten ağaçlardan arınmış bir mağara gözüküyordu.");
                        System.out.println("Bu mağaranın genişliği yaklaşık 3 metre boyunda olup neredeyse bir at arabasının geçebileceği düzeydeydi. ");
                        System.out.println("Mağaranın önünde kötü yapılmış birkaç barikat göze çarpıyordu. ");
                        System.out.println("Bakar bakmaz bu barikatların goblin işi olduğunu anlamıştı"+ characterName);
                        System.out.println("Ancak etrafta hiç gözcü olmaması tuhafına gitmişti. Bu durumda;");
                        System.out.println("1) Barikatları parçalayarak içeriye girmenin...");
                        System.out.println("2) Barikatları sessizce bozup içeriye girmenin...");
                        System.out.println("3) Patikayı yeniden bulup, ormanın derinliklerinden ayrılmanın...");
                        System.out.println("... vaktinin geldiğini düşündü.");
                        int firstStorySubOption1111trap = input.nextInt();
                        if(firstStorySubOption1111trap == 1){
                            System.out.println("Son barikatta parçalanmak üzereyken goblin çığlıkları işiten "+characterName+" silahına davrandı."); //  KESİN ÖLÜM combat olcak
                            System.out.println("Ancak çıkardığı bu gürültü yüzünden çok sayıda goblinle savaşması gerekecekti."); 
                            System.out.println("Bunun kazanamayacağı bir savaş olduğunu çok acı bir şekilde öğrenmek üzereydi.");
                        }
                        else if (firstStorySubOption1111trap == 2){
                            System.out.println(characterName+ " barikatları temkinli bir şekilde bozarak mağaranın yolunu açar. ");
                            System.out.println("Bunun ona çok vakit kaybettirdiğini ancak eğer içeride ona tehlike yaratacak bir goblin ");
                            System.out.println("grubu varsa farkında olmayacaklarından emin oldu. Ardından karanlık mağaraya girdi. ");
                            System.out.println("Mağaranın içerisinde ilerledikçe yanında bir aydınlatıcı olmadığı için küfürler eden "+characterName);
                            System.out.println("konuşan goblinlerin seslerini işitene kadar düz yolda ilerledi. Bu karanlıkta herhangi bir şey görmek mümkün değildi.");
                            System.out.println("1) Ses gelen yere saldır.");
                            System.out.println("2) Sessizce yaklaşmayı dene.");
                            System.out.println("3) Mağaradan ayrıl.");
                            int firstStorySubOption11112trap = input.nextInt();
                            if(firstStorySubOption11112trap == 1){
                                System.out.println(""); // COMBAT VAR 
                                // (Karanlıkta çok dezavantaj alınarak goblinlere sürpriz saldırı yapılınabilir.) 
                                // Goblinlere bu koşullarda saldırmamak gerektiğini öğrenen _________;
                                // combat kazanılırsa
                                System.out.println("1) Mağarada ilerlemeye devam et");
                                System.out.println("2) Mağaradan ayrıl");
                                int firstStorySubOption111121trap = input.nextInt();
                                if(firstStorySubOption111121trap == 1){
                                    System.out.println("Mağara boyunca ilerledikçe göze titreyen bir ateşin ışığı vurmaktadır. Bu ateş, mağaranın sonundaki geniş salondan geliyordu.");
                                    System.out.println("Salon kısmına ilerleyen "+characterName+" goblinlerin esirlerini tuttukları kafesleri fark eder. ");
                                    System.out.println("Bu kafeslerin biri hariç diğerleri ya boş ya da kemik ve organ parçalarıyla doluydu. ");
                                    System.out.println("Farklı olan kafeste ise işkence görmüş dişi bir figür yatıyordu. ");
                                    System.out.println("Bu figürün insan olmadığı çok açıktı. Alın bölgesinden çıkan boynuzlar ve esmer ten rengi ile bunun bir orman perisi olduğu belli oluyordu.");
                                    System.out.println("Goblinler, avcıyı görür görmez var güçleriyle ona doğru koşup çığlıklar atmaya başlarlar. "); // COMBAT BAŞLAR
                                    System.out.println(characterName+" çatışma sonundahızlı aımlarla perinin olduğu kafese ilerledi.."); //COMBAT BAŞLAR
                                    System.out.println("1)Kafesin kilidini aç");
                                    System.out.println("2)'Hey iyi misin?'");
                                    System.out.println("3)'Hey sen de kimsin?'");
                                    int firstStorySubOption1111211trap = input.nextInt();
                                    if(firstStorySubOption1111211trap == 1){
                                        System.out.println("Peri kafesin kilidinin açılmasıyla avcıya doğru döndü.");
                                        System.out.println("Yüzü yaralarla dolu olan bu ufak yaratık, tam konuşacağı sırada arkadan gelen goblinlerin çığlıklarını işitip kafesin derinliklerine çekilir. ");
                                        System.out.println(characterName+" daha çok goblin olabileceğinden korkuyordu. ");
                                        System.out.println("Biraz sonra karşılarına çıkacak goblin grubunun avdan dönen bir ekip olabileceğini düşünmemişti ancak.");
                                        System.out.println("Bunun kazanamayacağı bir savaş olduğunu çok acı bir şekilde öğrenmek üzereydi.");// combat yok krakter ölür    
                                    }
                                     else if(firstStorySubOption11112trap == 2){
                                        System.out.println("Peri sesi işitir işitmez avcıya doğru döndü.");
                                        System.out.println("Yüzü yaralarla dolu olan bu ufak yaratık, tam konuşacağı sırada arkadan gelen goblinlerin çığlıklarını işitip kafesin derinliklerine çekilir.");
                                        System.out.println(characterName+" daha çok goblin olabileceğinden korkuyordu. Biraz sonra karşılarına çıkacak goblin grubunun avdan dönen bir ekip olabileceğini düşünmemişti ancak.");
                                        System.out.println("Bunun kazanamayacağı bir savaş olduğunu çok acı bir şekilde öğrenmek üzereydi.");// combat yok krakter ölür
                                    }
                                    else if(firstStorySubOption11112trap == 3){
                                        System.out.println("Peri kafesin kilidinin açılmasıyla avcıya doğru döndü.");
                                        System.out.println("Yüzü yaralarla dolu olan bu ufak yaratık, tam konuşacağı sırada arkadan gelen goblinlerin çığlıklarını işitip kafesin derinliklerine çekilir.");
                                        System.out.println(characterName+" daha çok goblin olabileceğinden korkuyordu.");
                                        System.out.println("Biraz sonra karşılarına çıkacak goblin grubunun avdan dönen bir ekip olabileceğini düşünmemişti ancak. ");
                                        System.out.println("Bunun kazanamayacağı bir savaş olduğunu çok acı bir şekilde öğrenmek üzereydi.");// combat yok krakter ölür
                                    }                                            
                                }
                                else if ( firstStorySubOption111121trap == 2){
                                    
                                    System.out.println("Mağaradan ayrılmak için doğru bir karardı.");
                                    System.out.println("Çünkü biraz sonra mağaralarına dönen onlarca goblin gözükecekti.");
                                    System.out.println("Goblinler inlerine dönerken oldukça keyifli görünüyorlardı."); 
                                    System.out.println("Bunun sebebinin yanlarında halatlarla taşıdıkları yaralı bir geyik olmasıydı.");
                                    System.out.println("Avlamaya çalıştığı geyiğin küçük yeşil canavarlar tarafından çalınmasına üzüldü avcı. ");
                                    System.out.println("Eli boş bir şekilde kulübesine doğru yola çıktı.");
                                    System.out.println("UFUK HAZIRLICAK BURAYI");
                                    System.out.println("1) Çalılara pusu kur");
                                    System.out.println("2) Patikayı yeniden bul, ormanın derinliklerinden ayrıl");
                                    int firstStorySubOption111111121 = input.nextInt();
                                    if(firstStorySubOption111111121 == 1){
                                        System.out.println("Ormana gece çöküyordu. Güney Palamut Ormanına vuran ışık süzmelerinin gittikçe kaybolduğu görülüyordu. ");
                                        System.out.println("Ağaçların alt tarafları kararmıştı bile. Sessizlik baykuş ötmeleri ile bozuluyordu. Etrafta dolaşan son börtü böcek ise yuvalarına çekilmek için hazırlık yapmaktaydı. ");
                                        System.out.println(characterName+ " çalıların içinde pusu kurduğu sürece bolca böğürtlen saklandığı çalının içinde. ");
                                        System.out.println("Bunlar ormanın en leziz böğürtlenleri olan yıldız böğürtlenleriydi. ");
                                        System.out.println("Birkaçını ağzına atıp ne kadar iyi olduklarını tekrar onayladı. ");
                                        System.out.println("Saatlerin geçmesine rağmen goblin görememesi canını iyice sıkmıştı.");
                                        System.out.println("1) Yıldız böğürtlenlerini topla");
                                        System.out.println("2) Etrafta öten baykuşun sesini taklit et");
                                        System.out.println("3) Çalıda kalmaya devam et");
                                        System.out.println("4) Patikayı yeniden bul, ormanın derinliklerinden ayrıl");
                                        int calioption = input.nextInt();
                                        if(calioption == 1){
                                            System.out.println("Eh en azından bu gece aç yatmayacağım diye söylendi "+characterName);
                                            System.out.println("Gözleri hâla onu habersizce yakalayabileceği bir goblini arıyordu.");
                                            System.out.println("İstediği birkaç dakika sonra gerçekleşecekti. Çalının yakınlarında İki tane silahsız goblin belirdi.");
                                            System.out.println("Bir şeyi arıyorlar gibi halleri vardı. Avcı bu goblinlerin arkadaşlarını aradığından emin oldu. Saldırmak için çok uygun bir fırsattı. ");
                                            System.out.println("1) Saldır");
                                            System.out.println("2) Saldırma, çalıda kalmaya devam et");
                                            int calioption1 = input.nextInt();
                                            if(calioption1 == 1){
                                                // combat var
                                                System.out.println("Silahını iyice temizleyen "+characterName+" daha fazla buralarda durmanın bir anlamı olmadığını düşünerek bölgeyi terk eder.");
                                                System.out.println("1) Patikayı yeniden bul, ormanın derinliklerinden ayrıl");
                                            }
                                            else if(calioption1 == 2){
                                                // combat yok
                                                System.out.println("Daha fazla buralarda durmanın bir anlamı olmadığını düşünerek bölgeyi terk eder.");
                                                System.out.println("1) Patikayı yeniden bul, ormanın derinliklerinden ayrıl");
                                            }
                                        }
                                        else if(calioption == 2){
                                            System.out.println("sesi taklit et");
                                        }
                                        else if(calioption == 3){
                                            System.out.println("Çalıda kalmaya devam eder!!");
                                        }
                                        else if(calioption == 4){
                                            System.out.println("1) Patikayı yeniden bul, ormanın derinliklerinden ayrıl");
                                        } 
                                    }
                                    if(firstStorySubOption111111121 == 2){
                                        System.out.println("patkiyatı yeniden bul");
                                    }
                                    
                                    
                                }
                                else {
                                    
                                }
                            }
                            else if(firstStorySubOption11112trap == 2){
                                System.out.println("İşittiği çokça goblin seslerinden sonra, ''Mağaranın içerisi bu yaratıklardan dolup taşıyor.'' dedi "+characterName );
                                System.out.println("''Fark edilmeden önce burayı terk etsem iyi olacak. Buraya hazırlıksız gelmek intihardan farksız.'' diye ekleyip..");
                                System.out.println("1)Mağarada ilerler. ");
                                System.out.println("2)Mağaradan ayrıl.");
                                int firstStorySubOption111122trap = input.nextInt();
                                 if(firstStorySubOption111122trap == 1){
                                    System.out.println("Mağara boyunca ilerledikçe göze titreyen bir ateşin ışığı vurmaktadır. Bu ateş, mağaranın sonundaki geniş salondan geliyordu.");
                                    System.out.println("Salon kısmına ilerleyen "+characterName+" goblinlerin esirlerini tuttukları kafesleri fark eder. ");
                                    System.out.println("Bu kafeslerin biri hariç diğerleri ya boş ya da kemik ve organ parçalarıyla doluydu. ");
                                    System.out.println("Farklı olan kafeste ise işkence görmüş dişi bir figür yatıyordu. ");
                                    System.out.println("Bu figürün insan olmadığı çok açıktı. Alın bölgesinden çıkan boynuzlar ve esmer ten rengi ile bunun bir orman perisi olduğu belli oluyordu.");
                                    System.out.println("Goblinler, avcıyı görür görmez var güçleriyle ona doğru koşup çığlıklar atmaya başlarlar. "); // COMBAT BAŞLAR
                                    System.out.println(characterName+"çatışma sonundahızlı aımlarla perinin olduğu kafese ilerledi.."); //COMBAT BAŞLAR
                                    System.out.println("1)Kafesin kilidini aç");
                                    System.out.println("2)'Hey iyi misin?'");
                                    System.out.println("3)'Hey sen de kimsin?'");
                                    int firstStorySubOption1111211trap = input.nextInt();
                                    if(firstStorySubOption1111211trap == 1){
                                        System.out.println("Peri kafesin kilidinin açılmasıyla avcıya doğru döndü.");
                                        System.out.println("Yüzü yaralarla dolu olan bu ufak yaratık, tam konuşacağı sırada arkadan gelen goblinlerin çığlıklarını işitip kafesin derinliklerine çekilir. ");
                                        System.out.println(characterName+" daha çok goblin olabileceğinden korkuyordu. ");
                                        System.out.println("Biraz sonra karşılarına çıkacak goblin grubunun avdan dönen bir ekip olabileceğini düşünmemişti ancak.");
                                        System.out.println("Bunun kazanamayacağı bir savaş olduğunu çok acı bir şekilde öğrenmek üzereydi.");// combat yok krakter ölür    
                                    }
                                    else if(firstStorySubOption11112trap == 2){
                                        System.out.println("Peri sesi işitir işitmez avcıya doğru döndü.");
                                        System.out.println("Yüzü yaralarla dolu olan bu ufak yaratık, tam konuşacağı sırada arkadan gelen goblinlerin çığlıklarını işitip kafesin derinliklerine çekilir.");
                                        System.out.println(characterName+" daha çok goblin olabileceğinden korkuyordu. Biraz sonra karşılarına çıkacak goblin grubunun avdan dönen bir ekip olabileceğini düşünmemişti ancak.");
                                        System.out.println("Bunun kazanamayacağı bir savaş olduğunu çok acı bir şekilde öğrenmek üzereydi.");// combat yok krakter ölür
                                    }
                                    else if(firstStorySubOption11112trap == 3){
                                        System.out.println("Peri kafesin kilidinin açılmasıyla avcıya doğru döndü.");
                                        System.out.println("Yüzü yaralarla dolu olan bu ufak yaratık, tam konuşacağı sırada arkadan gelen goblinlerin çığlıklarını işitip kafesin derinliklerine çekilir.");
                                        System.out.println(characterName+"daha çok goblin olabileceğinden korkuyordu.");
                                        System.out.println("Biraz sonra karşılarına çıkacak goblin grubunun avdan dönen bir ekip olabileceğini düşünmemişti ancak. ");
                                        System.out.println("Bunun kazanamayacağı bir savaş olduğunu çok acı bir şekilde öğrenmek üzereydi.");// combat yok krakter ölür
                                    }
                                } 
                                else if(firstStorySubOption111122trap == 2){
                                    System.out.println("Mağaradan ayrılmak için doğru bir karardı.");
                                    System.out.println("Çünkü biraz sonra mağaralarına dönen onlarca goblin gözükecekti.");
                                    System.out.println("Goblinler inlerine dönerken oldukça keyifli görünüyorlardı."); 
                                    System.out.println("Bunun sebebinin yanlarında halatlarla taşıdıkları yaralı bir geyik olmasıydı.");
                                    System.out.println("Avlamaya çalıştığı geyiğin küçük yeşil canavarlar tarafından çalınmasına üzüldü avcı. ");
                                    System.out.println("Eli boş bir şekilde kulübesine doğru yola çıktı.");
                                } 
                            }
                            else if(firstStorySubOption11112trap == 3){
                                System.out.println(characterName +" mağaradan uzaklaşırken, tuzağına yakalanmış bir goblin fark eder.");
                                System.out.println(" Bacağı kan içinde kalan goblin acıyla avcının üzerine atılır. ");
                                System.out.println("Goblinlerin tek başına tehlikeli canavarlar olmadığı aşikardı. ''Belki de..'' dedi avcı düşünceli bir şekilde ve ekledi.");
                                System.out.println(characterName+" Belki de onları tek tek ve gafil avlamam gerekiyordur.'' Daha çok tuzağın ve materyale gerekli olacaktı şüphesiz böyle bir işe girişilecekse.");
                                // KOLAY COMBAT TUZAGA DUSEN GOBLINLE
                                System.out.println("UFUK HAZIRLICAK BURAYI");
                                System.out.println("1) Çalılara pusu kur");
                                System.out.println("2) Patikayı yeniden bul, ormanın derinliklerinden ayrıl");
                                int firstStorySubOption11111111 = input.nextInt();
                                if(firstStorySubOption11111111 == 1){
                                    System.out.println("Ormana gece çöküyordu. Güney Palamut Ormanına vuran ışık süzmelerinin gittikçe kaybolduğu görülüyordu. ");
                                    System.out.println("Ağaçların alt tarafları kararmıştı bile. Sessizlik baykuş ötmeleri ile bozuluyordu. Etrafta dolaşan son börtü böcek ise yuvalarına çekilmek için hazırlık yapmaktaydı. ");
                                    System.out.println(characterName+ " çalıların içinde pusu kurduğu sürece bolca böğürtlen saklandığı çalının içinde. ");
                                    System.out.println("Bunlar ormanın en leziz böğürtlenleri olan yıldız böğürtlenleriydi. ");
                                    System.out.println("Birkaçını ağzına atıp ne kadar iyi olduklarını tekrar onayladı. ");
                                    System.out.println("Saatlerin geçmesine rağmen goblin görememesi canını iyice sıkmıştı.");
                                    System.out.println("1) Yıldız böğürtlenlerini topla");
                                    System.out.println("2) Etrafta öten baykuşun sesini taklit et");
                                    System.out.println("3) Çalıda kalmaya devam et");
                                    System.out.println("4) Patikayı yeniden bul, ormanın derinliklerinden ayrıl");
                                    int calioption = input.nextInt();
                                    if(calioption == 1){
                                        System.out.println("Eh en azından bu gece aç yatmayacağım diye söylendi "+characterName);
                                        System.out.println("Gözleri hâla onu habersizce yakalayabileceği bir goblini arıyordu.");
                                        System.out.println("İstediği birkaç dakika sonra gerçekleşecekti. Çalının yakınlarında İki tane silahsız goblin belirdi.");
                                        System.out.println("Bir şeyi arıyorlar gibi halleri vardı. Avcı bu goblinlerin arkadaşlarını aradığından emin oldu. Saldırmak için çok uygun bir fırsattı. ");
                                        System.out.println("1) Saldır");
                                        System.out.println("2) Saldırma, çalıda kalmaya devam et");
                                        int calioption1 = input.nextInt();
                                        if(calioption1 == 1){
                                            // combat var
                                            System.out.println("Silahını iyice temizleyen "+characterName+" daha fazla buralarda durmanın bir anlamı olmadığını düşünerek bölgeyi terk eder.");
                                            System.out.println("1) Patikayı yeniden bul, ormanın derinliklerinden ayrıl");
                                            int patikaoption = input.nextInt();
                                            if(patikaoption >=0){
                                                System.out.println("Patikayı ararken acı bir kadın inlemesi duyulur. ''Yardım edin! Buraya sıkıştım. Lütfen yardım edin!'' ");
                                                System.out.println("diye yankılanıyordu ses. Goblinlerin masum bir kadını yakaladığından hiç şüphesi yoktu avcının. ");
                                            }
                                            else {
                                                System.out.println("Patikayı ararken acı bir kadın inlemesi duyulur. ''Yardım edin! Buraya sıkıştım. Lütfen yardım edin!'' ");
                                                System.out.println("diye yankılanıyordu ses. Goblinlerin masum bir kadını yakaladığından hiç şüphesi yoktu avcının. ");
                                            }      
                                        }
                                        else if(calioption1 == 2){
                                            // combat yok
                                            System.out.println("Daha fazla buralarda durmanın bir anlamı olmadığını düşünerek bölgeyi terk eder.");
                                            System.out.println("1) Patikayı yeniden bul, ormanın derinliklerinden ayrıl");
                                            int patikaoption = input.nextInt();
                                            if(patikaoption >=0){
                                                System.out.println("Patikayı ararken acı bir kadın inlemesi duyulur. ''Yardım edin! Buraya sıkıştım. Lütfen yardım edin!'' ");
                                                System.out.println("diye yankılanıyordu ses. Goblinlerin masum bir kadını yakaladığından hiç şüphesi yoktu avcının. ");
                                            }
                                            else {
                                                System.out.println("Patikayı ararken acı bir kadın inlemesi duyulur. ''Yardım edin! Buraya sıkıştım. Lütfen yardım edin!'' ");
                                                System.out.println("diye yankılanıyordu ses. Goblinlerin masum bir kadını yakaladığından hiç şüphesi yoktu avcının. ");
                                            }
                                        }
                                    }
                                    else if(calioption == 2){
                                        System.out.println("2) Baykuş sesini taklit et");
                                    }
                                    else if(calioption == 3){
                                        System.out.println("3) Çalıda kalmaya devam et");
                                    }
                                    else if(calioption == 4){
                                        System.out.println("Patikayı ararken acı bir kadın inlemesi duyulur. ''Yardım edin! Buraya sıkıştım. Lütfen yardım edin!'' ");
                                        System.out.println("diye yankılanıyordu ses. Goblinlerin masum bir kadını yakaladığından hiç şüphesi yoktu avcının. ");
                                    }
                                }
                                else if(firstStorySubOption11111111 == 2){
                                    System.out.println("Patikayı ararken acı bir kadın inlemesi duyulur. ''Yardım edin! Buraya sıkıştım. Lütfen yardım edin!'' ");
                                    System.out.println("diye yankılanıyordu ses. Goblinlerin masum bir kadını yakaladığından hiç şüphesi yoktu avcının. ");
                                }
                            }
                            else {
                                
                            }
                        }
                        else if(firstStorySubOption1111trap == 3){
                            System.out.println("Patikayı ararken acı bir kadın inlemesi duyulur. ''Yardım edin! Buraya sıkıştım. Lütfen yardım edin!'' ");
                            System.out.println("diye yankılanıyordu ses. Goblinlerin masum bir kadını yakaladığından hiç şüphesi yoktu avcının. ");
                            System.out.println("1) Sese doğru ilerle");
                            int followvoice = input.nextInt();
                            if(followvoice >=0){
                                System.out.println("Kadın figürü belirginleştikçe alnından çıkan kıvrımlı boynuzlarını onun bir peri olduğunu gösteriyordu. ");
                                System.out.println("Kadın sarı yırtmaçlı uzun bir elbise giymiş ve kıpkırmızı parıldayan bir kolye takmıştı. ");
                                System.out.println("Sağ bacağının tuzağa yakalandığı gözüküyordu. Acı içinde kıvrandığını gördü "+characterName);
                                System.out.println(characterName+", kadına yaklaşınca birbirlerini fark ettiler. Kadın ağlamaklı bir çehre ile avcıyı süzdü ve yardım talep etti. ");
                                System.out.println("1) Okumaya devam et");
                                int keepreading = input.nextInt();
                                if(keepreading >=0){
                                    System.out.println(characterName+"acele ile tuzağı bozmaya başladı. Bu tuzak kendi kurduklarından biriydi");
                                    System.out.println("bu yüzden onu bozmak çok da zor olmayacaktı. Tuzak ile uğraşırken kadınla konuşmaya başladı.");
                                    System.out.println("1) İyi misin? Ne oldu sana?");
                                    System.out.println("2) Sen bir orman perisisin.");
                                    System.out.println("3) Sen kimsin?");
                                    int keepreading1 = input.nextInt();
                                    if(keepreading1 == 1){
                                        System.out.println("-İyiyim.. Yalnızca tuzağı fark edemedim. Benim dikkatsizliğim.. Ormanın bu  ");
                                        System.out.println("kıyısında dolaşırken daha dikkatli olmalıydım. Sen kimsin,Hayatımı kime borçluyum?");
                                        System.out.println("");
                                        System.out.println("1) -Ben "+characterName+". Kendini tanıttıktan sonra tuzağı çözer.");
                                        System.out.println("2) Sessiz kal, tuzağı çözmeye devam et.");
                                        System.out.println("Tuzak çözüldükten sonra peri ayağa kalkmaya çalıştı ancak ayağı düşündüğünden daha kötüyü.");
                                        System.out.println("1) Perinin kalkmasına yardım et");
                                        System.out.println("2) Perinin yarasını sar, kalkmasına yardım et"); //dostluk+1
                                        int keepreading2 = input.nextInt();
                                        if(keepreading2 == 1){
                                            System.out.println("Uzun bir süre sonra birlikte kulübeye döndüler. Tek odası olan kulübe palamut ağaçlarının kabuklarından ");
                                            System.out.println("yapılmıştı, içeride bir masa, tek kişilik bir masa ve bir de iskemle vardı. Yemek pişirme işi, ");
                                            System.out.println("toprak zeminde duran bir kömür sobasının üstünde yapılıyordu. İçeri girer girmez kadını yatağa yatırdı ve sobayı yaktı.");
                                            System.out.println(characterName+" iskemleye oturup kadına orada ne arayıp aramadığını sordu.");
                                            System.out.println("");
                                            
                                        }
                                        else if(keepreading2 == 2){
                                            System.out.println("Uzun bir süre sonra birlikte kulübeye döndüler. Tek odası olan kulübe palamut ağaçlarının kabuklarından ");
                                            System.out.println("yapılmıştı, içeride bir masa, tek kişilik bir masa ve bir de iskemle vardı. Yemek pişirme işi, ");
                                            System.out.println("toprak zeminde duran bir kömür sobasının üstünde yapılıyordu. İçeri girer girmez kadını yatağa yatırdı ve sobayı yaktı.");
                                        //dostluk +1
                                        }
                                        else {
                                            
                                        }
                                        
                                    }
                                    else if(keepreading1 == 2){
                                        System.out.println("-Evet öyle söylerler.. Boynuzlardan fark ediliyor olsa gerek.");
                                        System.out.println("Peki ya sen? Sen kimsin, hayatımı kime borçluyum?");
                                    }
                                    else if(keepreading1 == 3){
                                        System.out.println("-Nadia... İsmim Nadia. Peri halkının son üyelerinden biriyim.");
                                        System.out.println("Sen kimsin, hayatımı kime borçluyum?");
                                        
                                    }
                                }
                                else {
                                    
                                }
                            }
                            else {
                                System.out.println("Kadın figürü belirginleştikçe alnından çıkan kıvrımlı boynuzlarını onun bir peri olduğunu gösteriyordu. ");
                                System.out.println("Kadın sarı yırtmaçlı uzun bir elbise giymiş ve kıpkırmızı parıldayan bir kolye takmıştı. ");
                                System.out.println("Sağ bacağının tuzağa yakalandığı gözüküyordu. Acı içinde kıvrandığını gördü "+characterName);
                                System.out.println(characterName+", kadına yaklaşınca birbirlerini fark ettiler. Kadın ağlamaklı bir çehre ile avcıyı süzdü ve yardım talep etti. ");
                                System.out.println("1) Okumaya devam et");
                                int keepreading = input.nextInt();
                                if(keepreading >=0){
                                    System.out.println(characterName+"acele ile tuzağı bozmaya başladı. Bu tuzak kendi kurduklarından biriydi");
                                    System.out.println("bu yüzden onu bozmak çok da zor olmayacaktı. Tuzak ile uğraşırken kadınla konuşmaya başladı.");
                                    System.out.println("1) İyi misin? Ne oldu sana?");
                                    System.out.println("2) Sen bir orman perisisin.");
                                    System.out.println("3) Sen kimsin?");
                                    int keepreading1 = input.nextInt();
                                    if(keepreading1 == 1){
                                        System.out.println("-İyiyim.. Yalnızca tuzağı fark edemedim. Benim dikkatsizliğim.. Ormanın bu  ");
                                        System.out.println("kıyısında dolaşırken daha dikkatli olmalıydım. Sen kimsin,Hayatımı kime borçluyum?");
                                        System.out.println("");
                                        System.out.println("1) -Ben "+characterName+". Kendini tanıttıktan sonra tuzağı çözer.");
                                        System.out.println("2) Sessiz kal, tuzağı çözmeye devam et.");
                                        System.out.println("Tuzak çözüldükten sonra peri ayağa kalkmaya çalıştı ancak ayağı düşündüğünden daha kötüyü.");
                                        System.out.println("1) Perinin kalkmasına yardım et");
                                        System.out.println("2) Perinin yarasını sar, kalkmasına yardım et"); //dostluk+1
                                        int keepreading2 = input.nextInt();
                                        if(keepreading2 == 1){
                                            System.out.println("Uzun bir süre sonra birlikte kulübeye döndüler. Tek odası olan kulübe palamut ağaçlarının kabuklarından ");
                                            System.out.println("yapılmıştı, içeride bir masa, tek kişilik bir masa ve bir de iskemle vardı. Yemek pişirme işi, ");
                                            System.out.println("toprak zeminde duran bir kömür sobasının üstünde yapılıyordu. İçeri girer girmez kadını yatağa yatırdı ve sobayı yaktı.");    
                                        }
                                        else if(keepreading2 == 2){
                                            System.out.println("");
                                        }
                                        else {
                                            
                                        }    
                                    }
                                    else if(keepreading1 == 2){
                                        System.out.println("-Evet öyle söylerler.. Boynuzlardan fark ediliyor olsa gerek.");
                                        System.out.println("Peki ya sen? Sen kimsin, hayatımı kime borçluyum?");
                                    }
                                    else if(keepreading1 == 3){
                                        System.out.println("-Nadia... İsmim Nadia. Peri halkının son üyelerinden biriyim.");
                                        System.out.println("Sen kimsin, hayatımı kime borçluyum?");
                                    }
                                }
                                else {
                                    
                                }
                            }
                        }
                        else {
                        
                        }                                
                    } // tuzak seçeneği bitti
                        
                    
                    else if(firstStorySubOption111 == 4){
                    
                    }
                    else {
                        
                    }
                }
                else if(firstStorySubOption11 == 2){
                    
                }
                else if(firstStorySubOption11 == 3){
                    
                }
                else if(firstStorySubOption11 == 4){ 
                    System.out.println("Patikayı ararken acı bir kadın inlemesi duyulur. ''Yardım edin! Buraya sıkıştım. Lütfen yardım edin!'' ");
                    System.out.println("diye yankılanıyordu ses. Goblinlerin masum bir kadını yakaladığından hiç şüphesi yoktu avcının. "); 
                }
                else {
                    System.out.println("yanlış seçim yaptın");
                }
            }
            else if(firstStoryOption == 2){
                
            }
            else if(firstStoryOption == 3){
                
            }
            else {
                
            }  
        }
        else if(firstStoryOption == 2 ){
            
        }
        else if(firstStoryOption == 3 ){
            
        }
        else {
            System.out.println("Yanlış seçim yaptın!");
        }
        
        
       
        
        
        
       /*
        Scanner input = new Scanner(System.in);
        String name = null;
        int hp,str,dex,agi;
               
// System.out.println("Now, you have to create an enemy.");
        
        System.out.println("1) Enter enemy's name:");
        name = input.nextLine();
                        
        System.out.println("2) Enter enemy's HP:");
        hp = input.nextInt();
                    
        System.out.println("3) Enter enemy's STR:");
        str = input.nextInt();
        
        System.out.println("4) Enter enemy's DEX:");
        dex = input.nextInt();
        
        System.out.println("5) Enter enemy's AGI:");
        agi = input.nextInt();
                
        Enemy trainingENEMY1 = new Enemy(1,name,hp,str,dex,agi);
        System.out.println("MOB ADI: "+trainingENEMY1.getEnemyName());
        System.out.println("MOB HP : "+trainingENEMY1.getEnemyHP());
        System.out.println("MOB STR: "+trainingENEMY1.getEnemySTR());
        System.out.println("MOB DEX: "+trainingENEMY1.getEnemyDEX());
        System.out.println("MOB DEX: "+trainingENEMY1.getEnemyAGI());
        System.out.println("BATTLE IS STARTED!");
        Battle newBattle = new Battle();
        newBattle.createBattle();
        if(getEnemyHP()<=0){
            System.out.println("Congratulations. You won!");
            System.out.println("Do you want to continue?");
                System.out.println("1) Yes!");
                System.out.println("2) NO:(");
                option=input.nextInt();
                if(option==1){
                    Enemy trainingENEMY2 = new Enemy(1,name,hp,str,dex,agi);
                    Battle newBattle2 = new Battle();
                    newBattle2.createBattle();
                } else {
                    System.exit(0);
                }
        }
        else {
            System.out.println("You lost the battle.");
            System.out.println("Do you want to try again?");
                System.out.println("1) YES");
                System.out.println("2) NO");
                option=input.nextInt();
                if(option==1){
                    Enemy trainingENEMY2 = new Enemy(1,name,hp,str,dex,agi);
                    Battle newBattle3 = new Battle();
                    newBattle3.createBattle();
                } else {
                    System.exit(0);
                }
        }*/ 
    }  
}