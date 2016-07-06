package Main.builder;
/** 
 * Computer��Ʒ������, Ϊ�����Ӽ�, ֻ�г��⼸������ 
 *  
 * @author mrsimple 
 * 
 */  
public abstract class Computer {  
  
    protected int mCpuCore = 1;  
    protected int mRamSize = 0;  
    protected String mOs = "Dos";  
  
    protected Computer() {  
  
    }  
  
    // ����CPU������  
    public abstract void setCPU(int core);  
  
    // �����ڴ�  
    public abstract void setRAM(int gb);  
  
    // ���ò���ϵͳ  
    public abstract void setOs(String os);  
  
    @Override  
    public String toString() {  
        return "Computer [mCpuCore=" + mCpuCore + ", mRamSize=" + mRamSize  
                + ", mOs=" + mOs + "]";  
    }  
  
} 