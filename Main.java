class Main {
  public static void main(String[] args) 
  {
  int max = 300;
  double stC;
  double Fhr;
  for(int i = 0; i<=300;i++)
    if(i%20==0)
    {
      System.out.println("Fhr = "+ i+ "    stC = "+(i-32)/1.8);
    }
  }
}