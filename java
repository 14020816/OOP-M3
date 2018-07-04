public class TSPModel {
    int[] X;
    boolean[] marked;
    double f;
    double best_f;
    int[] X_best;
    double[][] c;
    int n;
    int count = 0;


    public void slove(int n)
    {
        //this.n = n;
        setInput(n);
        this.best_f = Double.MAX_VALUE;
        tryValue(1);
        System.out.print("Best route :");
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(X_best[i] + "->");
        }
        System.out.print("0");
        System.out.println();
        System.out.println("Minimal Distance: " + this.best_f);

    }

    private double distance()
    {
        double sum = 0;
       // sum += c[][0];
        for(int i = 0; i < n - 1; i++)
        {
            sum = sum + this.c[X[i]][X[i+1]];
        }
        sum = sum + c[X[n-1]][X[0]];
        return sum;
    }

    boolean check(int v)
    {
        return !marked[v];

    }

    public void tryValue(int k)
    {
        int v;
        for(v = 1; v < n; v++ )
        {
            if(check(v))
            {

                X[k] = v;
                marked[v] = true;


                if(k == n-1)
                {
                    f = distance();
                    if(f < best_f){
                        best_f = f;
                        for(int i= 1; i < n ; i++)
                        {
                            X_best[i] = X[i];
                        }
                    }
                    this.count++;
                    printSolution();

                }
                else
                    tryValue(k+1);
                marked[v] = false;
            }


        }

    }
    public void printSolution(){
        System.out.print(this.count + ": ");
        for(int i = 0; i < n-1 ; i ++)
        {
            System.out.print(X[i] + "->");
        }

        System.out.print(X[n-1] + "->0" );
        System.out.print("  DISTANCE : " + this.distance());
        System.out.println();
    }

    public void setInput(int n)
    {
        this.marked = new boolean[n];
        this.X_best = new int[n];
        this.X = new int[n];
        this.c = new double [][]{{0,5,8,1},{5,0,6,2},{8,6,0,3},{1,2,3,0}};
        this.n = n;
    }


    public static void main(String []args)
    {
        TSPModel T = new TSPModel();
      //  T.setInput(6);
        T.slove(4);
    }



}
