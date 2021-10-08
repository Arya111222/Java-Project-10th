import java.util.*;
public class project
{
    //Main Arrays   
    int m_cust_id[]={1,2,3,0,0,0,0,0,0,0};

    int m_prod_id[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,0,0,0,0,0};
    String m_prod[]={"Red Shirt","Blue Jeans","Yellow T-Shirt","Yellow Tie","Leather Belt","Yellow Trousers","Maroon Shirt","White Shirt","Pink Skirt","Sunglasses","Green Hoodie","Camo Pants","Black Belt","White Socks","School Tie","","","","",""};
    String m_categ[]={"Clothing","Clothing","Clothing","Accessory","Accessory","Clothing","Clothing","Clothing","Clothing","Accessory","Clothing","Clothing","Accessory","Accessory","Accessory","","","","",""};
    String m_gender[]={"Men","Men","Men","Men","Men","Women","Women","Women","Women","Women","Kids","Kids","Kids","Kids","Kids","","","","",""};
    int m_quant[]={500,700,300,200,550,600,750,500,650,450,800,750,650,550,850,0,0,0,0,0};
    int m_price[]={1000,1500,900,300,450,800,900,1000,750,400,600,500,300,100,200,0,0,0,0,0};
    char m_avail[]={'y','y','y','y','y','y','y','y','y','y','y','y','y','y','y',' ',' ',' ',' ',' '};
    String m_coupon[]={"","","","","","","","","",""};
    project()
    {
        int i,j;
        for(i=1;i<m_prod_id.length;i++)
        {
            if(max<m_prod[i].length())
                max=m_prod[i].length();
        }
        for(i=0;i<m_prod_id.length;i++)
        {
            for(j=m_prod[i].length();j<max;j++)
            {
                m_prod[i]=m_prod[i]+" ";
            }
        }
    }
    //Transaction Arrays
    int t_cust_id[]={1,2,3,0,0,0,0,0,0,0,0,0};
    String t_name[]={"Aditya Sawant","Rahul Tendulkar","Rohan Kute","","","","","","",""};
    int t_prod_id[]={5,3,13,0,0,0,0,0,0,0};
    String t_prod[]={"Leather Belt","Yellow T-Shirt","Black Belt","","","","","","",""};
    String t_categ[]={"Accessory","Clothing","Accessory","","","","","","",""};
    String t_gender[]={"Men","Men","Kids","","","","","","",""};
    int t_quant[]={8,5,1,0,0,0,0,0,0,0};
    int t_cost[]={7200,2250,300,0,0,0,0,0,0,0};

    int custid=3;
    int custno=2;

    static Scanner sc=new Scanner(System.in);
    static int exit=0;
    static int repeat=1;

    int max=m_prod[0].length();
    int k=15;
    static void main()
    {
        int ch;
        project ob=new project();
        do
        {
            System.out.println("\f\t\t\t\t\tRAYMOND APPARELS\n\n");
            System.out.println("\t\t\t\t\t1.ENQUIRY");
            System.out.println("\t\t\t\t\t2.REGISTRATION");
            System.out.println("\t\t\t\t\t3.BUY");
            System.out.println("\t\t\t\t\t4.BILL");
            System.out.println("\t\t\t\t\t5.ADD PRODUCT");
            System.out.println("\t\t\t\t\t6.REMOVE PRODUCT");
            System.out.println("\t\t\t\t\t7.EDIT PRODUCT");
            System.out.println("\t\t\t\t\t8.EXIT");
            System.out.println("Enter Your Choice");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                ob.enquiry();
                System.out.println("Enter 1 to continue");
                int n=sc.nextInt();
                if(n==1)
                {
                    repeat=1;
                }
                else
                {
                    repeat=0;
                }
                break;
                case 2:
                //ob.reg();
                break;
                case 3:
                ob.buy();
                break;
                case 4:
                ob.bill();
                break;
                case 5:
                ob.addprod();
                break;
                case 6:
                ob.removeprod();
                break;
                case 7:
                ob.editprod();
                break;
                case 8:
                repeat=0;
                break;
                default:
                System.out.println("Wrong Choice");
                System.out.println("Enter 1 to continue");
                repeat=sc.nextInt();
                break;
            }
            if(repeat==1)
            {
                exit=0;
            }
            else
            {
                exit=1;
            }

        }while(exit==0);
        System.out.println("\f \t\t\t\t\t  THANK YOU.\n \t\t\t\t\t  VISIT AGAIN.");
    }

    void enquiry()
    {
        int i,j;
        for(i=1;i<m_prod_id.length;i++)
        {
            if(max<m_prod[i].length())
                max=m_prod[i].length();
        }
        for(i=0;i<m_prod_id.length;i++)
        {
            for(j=m_prod[i].length();j<max;j++)
            {
                m_prod[i]=m_prod[i]+" ";
            }
        }
        System.out.println("\t\t-----------------------------------------------------------------");
        System.out.print("\t\t|ID\t|NAME");
        for(j=4;j<=max;j++)
        {
            System.out.print(" ");
        }
        System.out.println("|CATEGORY\t|GENDER\t|QUANTITY  "+"|PRICE");
        System.out.println("\t\t-----------------------------------------------------------------");
        for(i=0;i<m_prod_id.length;i++)
        {
            if(m_avail[i]=='y')
                System.out.println("\t\t|"+m_prod_id[i]+"\t|"+m_prod[i]+" |"+m_categ[i]+"\t|"+m_gender[i]+"\t|"+m_quant[i]+"\t   |"+m_price[i]);                

        }

    }

    void buy()
    {
        this.custid++;
        this.custno++;
        System.out.println("\fEnter Your Name");
        String s=sc.nextLine();
        s=sc.nextLine();
        t_name[this.custno]=s;
        m_cust_id[this.custno]=custid;
        System.out.println("Your ID is "+this.custid);
        System.out.println("Enter 1 to continue");
        int n=sc.nextInt();
        System.out.println("\f");
        int i,id=this.custid,ch,quant=0;boolean f=false;int custno,conti=1;
        for(i=3;i<m_cust_id.length;i++)
        {
            if(m_cust_id[i]==id)
            {
                f=true;
                break;
            }
        }
        if(f)
        {
            custno=this.custno;
            do
            {
                enquiry();
                t_cust_id[custno]=id;
                System.out.println("Welcome\nEnter Your Choice");
                ch=sc.nextInt();
                if(m_avail[ch-1]=='y')
                {
                    t_prod_id[custno]=ch;
                    t_prod[custno]=m_prod[ch-1];
                    t_categ[custno]=m_categ[ch-1];
                    t_gender[custno]=m_gender[ch-1];
                    System.out.println("Enter Your Required Quantity");
                    for(i=0;i>-1;i++)
                    {
                        quant=sc.nextInt();
                        if(quant>m_quant[ch-1])
                        {
                            System.out.println("Please Enter A Valid Quantity");
                            continue;
                        }

                        else
                        {
                            t_quant[custno]=quant;
                            break;
                        }
                    }
                    m_quant[ch-1]=m_quant[ch-1]-quant;
                    t_cost[custno]=m_price[ch-1]*quant;

                }
                else
                {
                    System.out.println("Invalid Input");
                    continue;
                }
                custno++;
                this.custno++;
                System.out.println("Press 1 to continue Shopping");
                conti=sc.nextInt();

            }while(conti==1);
        }
        else
        {
            System.out.println("ID Not Found");

        }
        repeat=1;
    }

    void bill()
    {
        System.out.println("\fEnter Your ID");
        int id=sc.nextInt();boolean f=false,f1=false;int i,j,gamt=0;double disc=0.0,gst;String ch="";String coupon,db;
        for(i=0;i<m_cust_id.length;i++)
        {
            if(m_cust_id[i]==id)
            {
                f=true;
                break;
            }
        }
        if(f)
        {
            System.out.println("Do You Have A Discount Coupon?(YES/NO)");
            ch=sc.next();
            if(ch.equals("YES"))
            {
                System.out.println("Enter Your Coupon Code");
                coupon=sc.next();
                for(i=0;i<10;i++)
                {
                    if(m_coupon[i].equals(coupon))
                    {
                        disc=20.0;
                        m_coupon[i]="";
                        f1=true;
                        break;
                    }
                }
                if(!f1)
                {
                    System.out.println("Code Not Found");
                }
            }
            System.out.println("WELCOME "+t_name[id-1]);
            System.out.println("\t\t-------------------------------------------------------------------");
            System.out.print("\t\t|ID\t|NAME");
            for(j=4;j<=max;j++)
            {
                System.out.print(" ");
            }
            System.out.println("|CATEGORY\t|GENDER\t|QUANTITY   "+"|AMOUNT");
            System.out.println("\t\t-------------------------------------------------------------------");
            for(i=0;i<t_cust_id.length;i++)
            {
                if(t_cust_id[i]==id)
                {
                    System.out.println("\t\t|"+t_prod_id[i]+"\t|"+t_prod[i]+"\t|"+t_categ[i]+"\t|"+t_gender[i]+"\t|"+t_quant[i]+"\t    |"+t_cost[i]);
                    gamt=gamt+t_cost[i];
                }

            }
            if(gamt>=1000)
                gst=12.0;
            else
                gst=5.0;
            System.out.println("\n\n\t\t\t\t\t\t\t\tGROSS AMOUNT="+gamt+"Rs.");
            System.out.println("\t\t\t\t\t\t\t\t\t GST="+(int)(gamt*gst/100)+"Rs.");
            System.out.println("\t\t\t\t\t\t\t\t  NET AMOUNT="+(int)((gamt+gamt*gst/100)*((100-disc)/100.0))+"Rs.");

            if(gamt>=2000)
            {
                System.out.println("Congratulations!You Have Got A Discount Code!");
                System.out.println("Your Coupon Code Is "+coupon());
            }
        }
        else
        {
            System.out.println("ID Not Found");
        }
        System.out.println("Enter 1 to continue");
        int n=sc.nextInt();
        if(n==1)
        {
            repeat=1;
        }
        else
        {
            repeat=0;
        }
    }

    void addprod()
    {
        int i;String db;
        enquiry();
        if(k<20)
        {
            m_prod_id[k]=k+1;
            System.out.println("Enter The Product Name");
            db=sc.nextLine();
            m_prod[k]=sc.nextLine();
            System.out.println("Enter The Category(Clothing/Accessory)");
            for(i=0;i>-1;i++)
            {
                m_categ[k]=sc.nextLine();
                if(m_categ[k].equals("Clothing")||m_categ[k].equals("Accessory"))
                {
                    break;
                }
                else
                {
                    System.out.println("Please Enter The Correct Category");    
                    continue;
                }
            }
            System.out.println("Enter The Gender(Men/Women/Kids)");
            for(i=0;i>-1;i++)
            {
                m_gender[k]=sc.nextLine();
                if(m_gender[k].equals("Men")||m_gender[k].equals("Women")||m_gender[k].equals("Kids"))
                { 
                    break;
                }
                else
                {
                    System.out.println("Please Enter The Correct Gender");
                    continue;
                }
            }
            System.out.println("Enter The Quantity");
            m_quant[k]=sc.nextInt();
            System.out.println("Enter The Price");
            m_price[k]=sc.nextInt();
            m_avail[k]='y';
            enquiry();
            k++;
        }
        else
        {
            System.out.println("\fThere Are No Empty Spaces Left");
        }
        System.out.println("Enter 1 to continue");
        int n=sc.nextInt();
        if(n==1)
        {
            repeat=1;
        }
        else
        {
            repeat=0;
        }
    }

    void removeprod()
    {
        int i,rem=0;

        for(i=0;i>-1;i++)
        {
            enquiry();
            System.out.println("Which Product Do You Want To Remove?");
            rem=sc.nextInt();
            if(rem>=1&&rem<=k)
                break;
            else
                continue;
        }

        m_avail[rem-1]='n';
        System.out.println("Enter 1 to continue");
        int n=sc.nextInt();
        if(n==1)
        {
            repeat=1;
        }
        else
        {
            repeat=0;
        }
    }

    void editprod()
    {
        int i,edi=0;String db;
        enquiry();
        System.out.println("Which Product Do You Want To Change?");
        for(i=0;i>-1;i++)
        {
            edi=sc.nextInt();
            if(edi<=k&&edi>0)
            {    
                break;
            }
            else
            {
                System.out.println("Please Enter The Correct ID");    
                continue;
            }
        }
        System.out.println("Enter The New Category(Clothing/Accessory)");
        db=sc.nextLine();
        for(i=0;i>-1;i++)
        {
            m_categ[edi-1]=sc.nextLine();
            if(m_categ[edi-1].equals("Clothing")||m_categ[edi-1].equals("Accessory"))
            {    
                break;
            }
            else
            { 
                System.out.println("Please Enter The Correct Category");
                continue;
            }
        }
        System.out.println("Enter The New Gender(Men/Women/Kids)");
        for(i=0;i>-1;i++)
        {
            m_gender[edi-1]=sc.nextLine();
            if(m_gender[edi-1].equals("Men")||m_gender[edi-1].equals("Women")||m_gender[edi-1].equals("Kids"))
            {    
                break;
            }
            else
            { 
                System.out.println("Please Enter The Correct Gender");
                continue;
            }
        }
        System.out.println("Enter The New Quantity");
        m_quant[edi-1]=sc.nextInt();
        System.out.println("Enter The New Price");
        m_price[edi-1]=sc.nextInt();
        System.out.println("Enter 1 to continue");
        int n=sc.nextInt();
        if(n==1)
        {
            repeat=1;
        }
        else
        {
            repeat=0;
        }
    }

    String coupon()
    {
        int i;String s="";char c;
        for(i=0;i<6;i++)
        {
            c=(char)((int)((90-48)*Math.random()+48));
            if((c>=48&&c<=57)||(c>=65&&c<=90))
            {
                s=s+c;
            }
            else
            {
                continue;
            }
        }
        for(i=0;i<10;i++)
        {
            if(m_coupon[i].equals(""))
            {
                m_coupon[i]=s;
                break;
            }
        }
        return s;
    }
}