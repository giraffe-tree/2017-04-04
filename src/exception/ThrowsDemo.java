package exception;

/*
 * throws关键字通常被应用在声明方法时，用来指定可能抛出的异常。多个异常可以使用逗号隔开。
 * 当在主函数中调用该方法时，如果发生异常，就会将异常抛给指定异常对象
 * throw则需要用户自己捕获相关的异常，而后在对其进行相关包装，最后在将包装后的异常信息抛出。
 * 
 * summary:
 * 	1、throws出现在方法函数头；而throw出现在函数体。
	2、throws表示出现异常的一种可能性，并不一定会发生这些异常；throw则是抛出了异常，执
	行throw则一定抛出了某种异常。
	3、两者都是消极处理异常的方式（这里的消极并不是说这种方式不好），只是抛出或者可能抛出
	异常，但是不会由函数去处理异常，真正的处理异常由函数的上层调用处理。
 * */

public class ThrowsDemo {

	public static void main(String[] args) {
		
	}

}
