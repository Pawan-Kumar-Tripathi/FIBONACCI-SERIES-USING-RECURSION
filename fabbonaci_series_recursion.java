public class fabbonaci_series_recursion
    {
        public static void fabb(int a ,int b , int n)
            {
                if(n==0)
                {
                return;
            }
            int c= a+b;
            System.out.println(c);
            fabb(b,c,n-1);
            
            
            
            }
            public static void main()
            {
                int a = 0 , b=1,n=7;
                System.out.println(a);
                System.out.println(b);
                fabb(a,b,n-2);
            }
        }
            
 