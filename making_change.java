public class making_change {
    static int D[] ={2000,500,200,100,50,20,10,5,2,1};
    // static int D[] ={6,4,1};
    //n =10;
    /*
     * 1500
     *  600
     *  100
     */
    static int availD[] = {1,0,1,1,1,1,2,5,100,10};
    // static int availD[] = {0,0,0,0,0,0,0,5,0,0};
    static int madeChange = 0;
    static int AvailAmt=0;
  
    public static void main(String args[]) {
      
        int amt=2500;
        int ans[]={0,0,0,0,0,0,0,0,0,0};
        calAvailAmt();
        for(int i=0;i<D.length;i++)
        {
            if(availD[i] < amt/D[i])
            {
                ans[i] = availD[i];
                amt = amt -(D[i] * availD[i]);
            }
            else
            {
                ans[i] = amt/D[i];
                amt = amt%D[i];
            }
            madeChange +=ans[i]*D[i];
        }
        printArr(ans);
        System.out.println("Made Change ="+madeChange);
        System.out.println("Available Amount ="+AvailAmt);
    }
    static void printArr(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.println(D[i]+" X "+a[i]);
        }
    }
    static void calAvailAmt()
    {
        for(int i=0;i<D.length;i++)
        {
            AvailAmt +=D[i]*availD[i];
        }
    }
}

