public class getClass_and_zeros{
    

    public static String[] getClass_an_zeros(String d[])
    {
        
        String ip= d[0];
        

        String a_ip[]=ip.split("\\.");
       
        int f_octect=Integer.valueOf(a_ip[0]); 
        //System.out.println("\n\nfoctect before loop " +f_octect);
        int sub_i=Integer.valueOf(d[1]);
        //System.out.println("enetered ip :"+ip+"\n");
        
        
        String cls_name=" ";

        String default_subnet_mask=" ";
        int num=sub_i;
        int rem=0;
        int c=-1;
        int total_no_of_zeros=0;
        int req_zeros;
        int addtional_zeros=1;

        //System.out.println("\nip inserting in while loop "+num);
        //System.out.println("\n c before loop  "+c);
       
        while(num>0)
        {
            rem=rem%2;
            c++;
            num=num/2;
        }
       // System.out.println("c after loop "+c);

        int newNum=(int)Math.pow(2,c);
        if(sub_i>newNum)
        {
            c++;
        }
        req_zeros=c;

        
        if(f_octect>=1 &&f_octect<=127)
        {
            cls_name="Class A";
            default_subnet_mask="default subnet mask 255.0.0.0";
            total_no_of_zeros=24;
            addtional_zeros=total_no_of_zeros-req_zeros;
        }
        else if(f_octect>=128 &&f_octect<=191)
        {
            cls_name="Class B";
            default_subnet_mask="default subnet mask 255.255.0.0";
            total_no_of_zeros=16;
            addtional_zeros=total_no_of_zeros-req_zeros;

            
        }
        else if(f_octect>=192 &&f_octect<=223)
        {
            cls_name="Class C";
            default_subnet_mask="default subnet mask 255.255.255.0";
            total_no_of_zeros=8;
            addtional_zeros=total_no_of_zeros-req_zeros;

        }
        System.out.println("reamkining  zeros "+addtional_zeros);
       int number_host=(int)Math.pow(2,addtional_zeros)-2;
       //System.out.println("\n number of host "+number_host);
       String number_host_d=String.valueOf(number_host);
      
        //String to_num_host=String.valueOf(addtional_zeros);
        //d[0]=a;
        d[0]=cls_name;


        d[1]=default_subnet_mask;
        d[2]=number_host_d;

       // System.out.println("\n\ndefault subnet mask "+default_subnet_mask);
        

        return d;

    }
}
