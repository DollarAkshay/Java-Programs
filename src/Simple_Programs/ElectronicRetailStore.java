/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Simple_Programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

/**
 *
 * @author $Akshay$
 */
public class ElectronicRetailStore {
int billamt = 0;
void bill(String code)throws IOException
{
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
int i = 0;
boolean found = false;
String prcode[] =
{"PRMSA","PRMSB","PRMSC","PRMNA",
"PRMNB","PRMNC","PRLAA","PRLAB",
"PRLAC","PRLDA","PRLDB","PRDSA",
"PRDSB","PRDHA","PRDHB","PRCCA","PRCCB",
"PRCOA","PRCOB","PRTSA","PRTSB","PRTTA","PRTTB"};
int cost[] = {22787,30498,10190,11300,28019,22829,67900,60900,56990,45660,53890,35770,30990,37500,32450,9495,28995,16550,21000,93900,85990,73990,120990};
for(i=0;i<23;i++)
{
if(prcode[i].equalsIgnoreCase(code))
{
System.out.print("Enter the quantity you wish topurchase ");
int quantity = Integer.parseInt(br.readLine());
billamt += (cost[i]*quantity);
System.out.println("\nYour bill amount uptill now is Rs." + billamt);
found = true;
}
}
if (found == false)

System.out.println("Please double check the product code that you have entered");
System.out.println("\nPress enter key to go back to main menu");
br.readLine();
}
public static void main(String args[])throws IOException
{
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
ElectronicRetailStore ob = new ElectronicRetailStore();
int choice;
do{
System.out.println('\u000c');
System.out.println("**************************");
System.out.println("Welcome To CLICK");
System.out.println("The Electronic Store...run by a pretty girl :D");
System.out.println("**************************");
System.out.println("****Menu****");
System.out.println("**************************");
System.out.println("1. MOBILES");
System.out.println("2. LAPTOPS");
System.out.println("3. DESKTOPS");
System.out.println("4. CAMERAS");
System.out.println("5. TELEVISION SETS");
System.out.println("6. EXIT");
System.out.print("Please Choose A Menu Option ");
choice = Integer.parseInt(br.readLine());
switch(choice)
{
case 1:
{
System.out.println('\u000c');
System.out.println("1.Samsung Mobiles");
System.out.println("2.Nokia Mobiles");
System.out.println("Please Choose A Menu Option\n");

int choice1 = Integer.parseInt(br.readLine());
switch(choice1)
{
case 1:
{
System.out.println("Samsung GALAXY S Plus");

System.out.println("Product Details:Powered"
+"by a strong 1.4GHz processor for seamless and smooth usage"
+"that works beautifully with the all-new Android 2.3 OS, the"
+"GALAXY S Plus also features super-fast downloading with"
+"14.4Mbps HSPA and a stronger, longer 1,650mAh battery"
+"that lets you take advantage of all the advanced smartphone"
+"features without worrying about the battery dying on you. The"
+"new upgraded GALAXY S Plus brings you a smarter, advanced"
+"mobile experience that can only be summed up as the best of"
+"the best! ");
System.out.println("Cost: Rs.22,787.00");
System.out.println("Product Code: PRMSA");
System.out.println("");
System.out.println("Samsung Galaxy S2");
System.out.println("Product Details:This"
+"is simply the best smartphone! It comes with 10.92cm (4.3)"
+"SUPER AMOLED Plus, Dual Core Application Processor,"
+"8.49mm Slim Design, Say N Go : Samsung Voice Solution,"
+"Readers Hub, Social Hub 2.0, Game Hub, Music Hub,"
+"Samsung Live Panel, 8MP Camera with LED Flash, On Device"
+"Encryption, Microsoft Exchange ActiveSync, MDM (Mobile"
+"Device Management), VPN (Virtual Private Network, Cisco"
+"WebEx");
System.out.println("Cost: Rs.30,498.00");
System.out.println("Product Code: PRMSB");
System.out.println("");

System.out.println("Samsung Galaxy Pro");
System.out.println("Product Details:This"
+"Samsung phone comes with Various Apps for your business"
+"needs, Advanced Messaging Device, Social Hub Premium,"
+"Anything you want at Android Market, B2B solutions");
System.out.println("Cost: Rs.10,190.00");
System.out.println("Product Code: PRMSC");
break;
}
case 2:
{
System.out.println("Nokia C3");
System.out.println("Product Details:This"
+"Nokia phone comes with Touch screen and keypad,"
+"Custumisable Home Screen, Easy Email and Messaging, Fast"
+"mobile internet and Wi-Fi, Mobile entertainment");
System.out.println("Cost: Rs.11,300.00");
System.out.println("Product Code: PRMNA");
System.out.println("");
System.out.println("Nokia E7");
System.out.println("Product Details:This"
+"Nokia phone is the Ultimate Business Smartphone comes"
+"with a touchscreen and QWERTY keypad, Microsoft business"
+"apps, Free GPS Navigation, E7 Accesories and all new phone"
+"software");
System.out.println("Cost: Rs.28,019.00");
System.out.println("Product Code: PRMNB");
System.out.println("");
System.out.println("Nokia X7");
System.out.println("Product Details: This"
+"Nokia Smartphone comes with HD Games amd Music, 4"
+"AMOLED Touchscreen, Email and Social Networks, Fully"
+"customisable home screens, free GPS navigation, fast and"
+"effortless browsing, web TV on demand");
System.out.println("Cost: Rs.22,829.00");

System.out.println("Product Code: PRMNC");
break;

}
default:
System.out.println("Please choose a valid menu option\n");
break;
}
System.out.println("Enter the product code of the product you wish to purchase");
String cde = br.readLine();
ob.bill(cde);
break;
}
case 2:
{
System.out.println('\u000c');
System.out.println("1.Apple Laptops");
System.out.println("2.Dell Laptops");
System.out.println("Please Choose A Menu Option");
int choice2 = Integer.parseInt(br.readLine());
switch(choice2)
{
case 1:
{
System.out.println("Apple MacBook Air");
System.out.println("Product Details:MacBook"
+"Air is ultrathin, ultraportable, and ultra unlike anything else. But"
+"you don’t lose inches and pounds overnight. It’s the result of"
+"rethinking conventions. Of multiple wireless innovations. And of"
+"breakthrough design.");
System.out.println("Cost: Rs.67,900.00");
System.out.println("Product Code: PRLAA");
System.out.println("");

System.out.println("Apple MacBook Pro");
System.out.println("Product Details:MacBook"
+"Pro is the first Mac notebook built upon the revolutionary new"
+"Intel Core Duo. It’s actually two processors built into a single"
+"chip. The MacBook Pro series 1.83 and 2 GHz Processor"
+"speeds, 15.2 inch displays, 802.11 b/g Wireless networking,"
+"including Bluetooth and AirPort support, and ATI Radeon"
+"X1600 Graphics Adapters.");
System.out.println("Cost: Rs.60,900.00");
System.out.println("Product Code: PRLAB");
System.out.println("");
System.out.println("Apple MacBook");
System.out.println("Product Details:The new"
+"Apple MacBook does and has it all: up to 2GHz of pure Intel"
+"Core Duo power, an iSight camera, Front Row, iLife ’06, and a"
+"13 inch glossy widescreen display. ");
System.out.println("Cost: Rs.56,990.00");
System.out.println("Product Code: PRLAC");
System.out.println("");
break;
}
case 2:
{
System.out.println("Dell Inspiron 14R");
System.out.println("Product Details: Featuring"
+"the 2nd generation Intel® Core™ processors and Switch"
+"interchangeable lids. Available in 35.6 cm (14) and 39.6 cm"
+"(15.6) sizes.");
System.out.println("Cost: Rs.45,660.00");
System.out.println("Product Code: PRLDA");
System.out.println("");
System.out.println("Dell XPS15");
System.out.println("Product Details: This Dell"
+"Laptop comes with 2nd Generation Intel® Core™ processor,"
+"Razor-sharp graphics, Mind-blowing audio. Dell XPS 15 is"
+"designed to keep you entertained for up to 10 hours with a 9-"
+"cell battery upgrade.");
System.out.println("Cost: Rs.53,890.00");
System.out.println("Product Code: PRLDB");
System.out.println("");
break;
}
default:
System.out.println("Please choose a valid menu option");
break;
}
System.out.println("Enter the product code of the product you wish to purchase");
String cde = br.readLine();
ob.bill(cde);
break;
}
case 3:
{
System.out.println('\u000c');
System.out.println("1.Samsung Desktops");
System.out.println("2.HP Desktops");
System.out.println("Please Choose A Menu Option");
int choice3 = Integer.parseInt(br.readLine());
switch(choice3)
{
case 1:
{
System.out.println("Samsung SM932GW Desktop");
System.out.println("Product Details: New"
+"Windows VistaTM Certified widescreen monitors, ideal for"
+"multimedia entertainment and business multi-tasking.");



System.out.println("Cost: Rs.35,770.00");
System.out.println("Product Code: PRDSA");
System.out.println("");
System.out.println("Samsung SM940UX Desktop");

System.out.println("Product Details:"
+"Innovative monitor able to connect to the PC via USB. Ideal"
+"for adding additional screens without upgrading the graphics"
+"card.");
System.out.println("Cost: Rs.30,990.00");
System.out.println("Product Code: PRDSB");
System.out.println("");
break;
}
case 2:
{
System.out.println("HP Pavilion Slimline s5m series");
System.out.println("Product"
+"Details:Powerful Essential desktop with AMD Athlon dual-core"
+"processor, works in small spaces such as dorms, kitchens and"
+"bedrooms.");
System.out.println("Cost: Rs.37,500.00");
System.out.println("Product Code: PRDHA");
System.out.println("");
System.out.println("HP Omni 120Z series");
System.out.println("Product Details: Simple"
+"striking clutter-free design. All-in-One PC with AMD Athalon"
+"processor, integrated HD display, and wireless LAN");
System.out.println("Cost: Rs.32,450.00");
System.out.println("Product Code: PRDHB");

System.out.println("");
break;

}
default:
System.out.println("Please choose a valid menu option");
break;
}
System.out.println("Enter the product code of the product you wish to purchase");
String cde = br.readLine();
ob.bill(cde);
break;
}
case 4:
{
System.out.println('\u000c');
System.out.println("1.Canon Cameras");
System.out.println("2.Olympus Cameras");
System.out.println("Please Choose A Menu Option");
int choice4 = Integer.parseInt(br.readLine());
switch(choice4)
{
case 1:
{
System.out.println("Canon Digital IXUS 115 HS");
System.out.println("Product Details: The IXUS"
+"115 HS comes an array of bold, eye-catching colors that'll be a"
+"sure fit for any personality. This sleek and stylish digital camera"
+"is what you need to add that creative edge.It comes with a 12.1"
+"megapixel CMOS sensor with full HD movie recording.");
System.out.println("Cost: Rs.9,495.00");
System.out.println("Product Code: PRCCA");

System.out.println("");
System.out.println("Canon PowerShot SX40 HS");

System.out.println("Product Details: Featuring"
+"a massive 35x Wide-Angle (24 - 840mm) Optical Zoom lens"
+"with Intelligent IS for maximised image stabilization, full manual"
+"controls, Full HD movie recording, the PowerShot SX40 HS"
+"gives you the extreme photography experience.It has 35x"
+"optical zoom and a 12.1 megapixels CMOS sensor.");
System.out.println("Cost: Rs.28,995.00");
System.out.println("Product Code: PRCCB");
System.out.println("");
break;
}
case 2:
{
System.out.println("Olympus Stylus Tough- 3000");
System.out.println("Product Details: It has a"
+"12 megapixels CMOS Sensor and 2.7 inch LCD monitor. It is"
+"waterproof-10 ft-, Freezeproof-upto 10 degree celcius and it"
+"has dual image stabilization.");
System.out.println("Cost: Rs. 16,550.00");
System.out.println("Product Code: PRCOA");
System.out.println("");
System.out.println("Olympus FE-47");
System.out.println("Product Details: It"
+"comes with a 5x optical zoom, 14 megapixels and 2.7 inch"
+"LCD monitor. It has advanced face detection and dual image"
+"stabilization.");
System.out.println("Cost: Rs.21,000.00");
System.out.println("Product Code: PRCOB");
System.out.println("");
break;
}

default:
System.out.println("Please choose a valid menu option");
break;
}
System.out.println("Enter the product code of the product you wish to purchase");
String cde = br.readLine();
ob.bill(cde);
break;
}
case 5:
{
System.out.println('\u000c');
System.out.println("1.Sony Television Sets");
System.out.println("2.Toshiba Television Sets");
System.out.println("Please Choose A Menu Option");
int choice5 = Integer.parseInt(br.readLine());
switch(choice5)
{
case 1:
{
System.out.println("Sony BRAVIA NX720-LED");
System.out.println("Product Details: It comes"
+"with Dynamic Edge LED, OptiContrast and CORNING's Gorilla"
+"Glass Panel and it has a Wi-Fi Integrated set.It measures 46"
+"inches.");
System.out.println("Cost: Rs.93,900.00");
System.out.println("Product Code: PRTSA");
System.out.println("");
System.out.println("Sony BRAVIA EX520 Series");

System.out.println("Product Details: It comes"
+"with Full HD 1080 picture quality with Edge LED backlight,"
+"Skype™ Ready (requires camera CMU-BR100) and Internet"
+"Video, Facebook and Twitter.It measures 40 inches.");
System.out.println("Cost: Rs.85,990.00");
System.out.println("Product Code: PRTSB");
System.out.println("");
break;
}
case 2:
{
System.out.println("Toshiba SL415");
System.out.println("Product Details: It"
+"measures 32 inches and has Video Resolution: 720p, Refresh"
+"Rate: 60Hz and it comes with Internet Capabilities.");
System.out.println("Cost: Rs.73,990.00");
System.out.println("Product Code: PRTTA");
System.out.println("");
System.out.println("Toshiba TL515");
System.out.println("Product Details: It"
+"measures 55 inches and has Video Resolution: 1080p,"
+"Refresh Rate: ClearScan™ 240Hz and it comes with Internet"
+"Capabilities.");
System.out.println("Cost: Rs.1,20,990.00");
System.out.println("Product Code: PRTTB");
System.out.println("");
break;
}
default:
System.out.println("Please choose a valid menu option");
break;
}
System.out.println("Enter the product code of the product you wish to purchase");
String cde = br.readLine();
ob.bill(cde);
break;
}
}
}
while(choice!=6);
System.out.println('\u000c');
System.out.println("**************************");
System.out.println("The Electronic Store");
System.out.println("**************************");
System.out.println("****BILL****");
System.out.println("**************************");
Calendar c=Calendar.getInstance();
System.out.println("DATE : "+(c.get(Calendar.DATE)
+"/"+(c.get(Calendar.MONTH)+1)+"/"+(c.get(Calendar.YEAR)))
);
System.out.println("Total bill amount Rs:" + ob.billamt);
}
}
