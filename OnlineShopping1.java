import java.util.Scanner;

class Main{
    String name;
    String num;
    Main(String name,String num){
        this.name=name;
        this.num=num;
    }
}
class Seller{
    String name;

    Seller(String name){
        this.name=name;
    }
}
class product{
    String prod;
    double price;
    product(String prod,double price){
        this.prod=prod;
        this.price=price;
    }
}

class Order{
    Seller seller;
    product product;
    double totalprice;


    Order(Seller seller, product product) {
        this.seller = seller;
        this.product = product;
    }
}
public class OnlineShopping1 {
    public static void main(String[] args) {
        System.out.println("****Student Details****");
        System.out.println("Name: Rakshit Kapoor \nEnroll No.:E22CSEU1262\n");
        int sellch,prodch;

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name: ");String name= sc.nextLine();
        System.out.print("Enter your number:");String num=sc.nextLine();
        Main user=new Main(name,num);

        String ch="Enter your choice: ";

        Seller sell0= new Seller("GenZ factory");
        Seller sell1=new Seller("Cliche");
        product prod0=new product("Air Jordan 1",2000);
        product prod1=new product("Adidas Orignals",1500);
        product prod2=new product("Chiffon 1",999);
        product prod3=new product("Denim 9",1200);
        product prod4=new product("French Terry 9",1399);
        while (true){
            System.out.println("-----------Seller Menu-----------");
            System.out.println("0. "+sell0.name);
            System.out.println("1. "+sell1.name);
            System.out.println("2.Exit");
            System.out.print(ch);
            sellch=sc.nextInt();
            if( sellch==2){
                break;
            }

            System.out.println("-----------Product Menu-----------");
            System.out.println("0. " + prod0.prod + " - ₹" + prod0.price);
            System.out.println("1. " + prod1.prod + " - ₹" + prod1.price);
            System.out.println("2. " + prod2.prod + " - ₹" + prod2.price);
            System.out.println("3. " + prod3.prod + " - ₹" + prod3.price);
            System.out.println("4. " + prod4.prod + " - ₹" + prod4.price);
            System.out.println("5. Exit");
            System.out.print(ch);
            prodch=sc.nextInt();
            if (prodch==5){
                break;
            }
            Seller[] sellarr=new Seller[2];
            product[] prodarr=new product[5];
            sellarr[0]=sell1;
            sellarr[1]=sell1;

            prodarr[0]=prod0;
            prodarr[1]=prod1;
            prodarr[2]=prod2;
            prodarr[3]=prod3;
            prodarr[4]=prod4;


            Order fin=new Order(sellarr[sellch],prodarr[prodch]);
            fin.totalprice += fin.product.price;
            System.out.println("------------------Order list------------------\n");
            System.out.println("User: "+user.name);
            System.out.println("phone number: "+user.num);
            System.out.println("Seller: "+fin.seller.name);
            System.out.println("Product: "+fin.product.prod);
            System.out.println("Total Price: ₹"+fin.totalprice+"\n\n");
        }
        System.out.println("Thanks for Visiting!!!!!!");

    }
}
