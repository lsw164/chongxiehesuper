
public class chongxie extends cxdfulei{
    String b="I'm from GuangXi";
    public int fun(int a,int b){  //重写父类的方法
        int c=a*b;
        return c;
    }
    chongxie(){
        super();//调用父类的构造方法
        System.out.println(b);
    }


}

