class greedy_activity_selection{
    public static void main(String arg[])
    {
        int s[] ={1,3,0,5,3,5,6,8,8,2,12};
        int f[] ={4,5,6,7,8,9,10,11,12,13,14};
        int act_index[] = findAct(s,f);

        printArr(act_index);

    }
    static int[] findAct(int s[],int f[]){
        int tombstone =0;
        int act_index[]={0,0,0,0,0,0,0,0,0,0,0};
        
        for(int i=0;i<s.length;i++)
        {
            if(s[i]>=tombstone)
            {
                act_index[i] = 1;
                tombstone = f[i];
            }
        }

        return act_index;
    }
    static void printArr(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.println("S["+(i+1)+"] = "+a[i]);
        }
    }
}