public class TimeComplexityDemo 
{
    public static void main(String[] args)
    {
        double now = System.currentTimeMillis();

        TimeComplexityDemo demo = new TimeComplexityDemo();
        System.out.println(demo.findSum(77777));

        System.out.println("Time taken- " +(System.currentTimeMillis() - now) + " millisecs. ");
    }

    public int findSum(int n)// This method save times again it takes less space on virtual machine.
    {
        return n * (n+1) /2;
    }
    

    /*public int findSum(int n)
    {
        int sum= 0;
        for(int i=0;i<=n;i++)
        {
            sum = sum +i;
        }
        return sum;
    } */
    
}
