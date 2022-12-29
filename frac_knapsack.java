class frac_knapsack{
    public static void main(String args[])
    {
        int W=10,weight=0;

        int w[]={40,10,20,24};
        int v[]={280,100,120,120};
        double x[]={0.0,0.0,0.0,0.0};
        
        sortByRatio(w, v);
        for(int i=0;i<w.length && W>weight;i++)
        {
            if(weight+w[i] <= W)
                x[i] = 1;
            else
                x[i] = ((double)(W-weight))/w[i];
        }
        printArr(x);
    }
    static void sortByRatio(int w[],int v[])
    {
        int min=0,temp=0;
        for(int i=0;i<w.length-1;i++)
        {
            min = i;
            for(int j=i+1;j<w.length;j++)
            {
                if((v[min]/w[min]) < (v[j]/w[j]))
                {
                    min = j;
                }
            }
            temp = w[min];
            w[min] = w[i];
            w[i] = temp;

            temp = v[min];
            v[min] = v[i];
            v[i] = temp;
        }
    }
    static void printArr(double a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
