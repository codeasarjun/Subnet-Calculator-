
class ipCalculator
{
    public static void calculate(String ip,String subnet,ipCalController updatedata) // decalare class instane in signature will avoid initilaize error 

    {
       // System.out.println("ip in ip calculaot class "+ip+"\n\n");

        //String entered_sub_net=updatedata.enter_subnet.getText();
            String retriedClass_and_zeros[]=new String[3];
            String entered_ip_subnet[]=new String[3];
            entered_ip_subnet[0]=ip;
            entered_ip_subnet[1]=subnet;
            entered_ip_subnet[2]="Class";
            //System.out.println("\n\n\n reuired subnet "+entered_ip_subnet[1]);
            retriedClass_and_zeros=getClass_and_zeros.getClass_an_zeros(entered_ip_subnet);
            updatedata.lb_classs.setText(retriedClass_and_zeros[0]);
            updatedata.lb_default_sub_mask.setText(retriedClass_and_zeros[1]);
            updatedata.tf_totalHost.setText("Possible number of host "+retriedClass_and_zeros[2]);
            updatedata.tf_totalSubnet.setText("Total number of subnet "+subnet);
            
            updatedata.setLabeldata();
    }

    public static String calculate_CIDR_ip(String ip)
    {
        String b_ip[]=ip.split("\\.");
        return b_ip[3];

    }
   

}


/// frame contains "amrita.edu"

