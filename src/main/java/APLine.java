public class APLine
{
  private int a1, b1, c1;
  public APLine(int a, int b, int c){
    a1 = a;
    b1 = b;
    c1 = c;
  }

  public double getSlope(){
    double slope = -a1/b1;
    return slope;
  }

  public boolean isOnline(int x,int y){
    if(a1*x + b2*y + c == 0){
      return true;
    }
    return false;
  }
}
