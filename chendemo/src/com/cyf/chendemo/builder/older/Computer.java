package com.cyf.chendemo.builder.older;
/** 
 * Computer产品抽象类, 为了例子简单, 只列出这几个属性 
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
  
    // 设置CPU核心数  
    public abstract void setCPU(int core);  
  
    // 设置内存  
    public abstract void setRAM(int gb);  
  
    // 设置操作系统  
    public abstract void setOs(String os);  
  
    @Override  
    public String toString() {  
        return "Computer [mCpuCore=" + mCpuCore + ", mRamSize=" + mRamSize  
                + ", mOs=" + mOs + "]";  
    }  
  
} 