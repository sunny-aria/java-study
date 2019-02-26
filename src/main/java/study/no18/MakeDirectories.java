package study.no18;

import java.io.File;

/**
 * File 的不同方法
 * MakeDirectories.java
 * @author sunny
 * 2017年2月28日上午7:41:41
 */
public class MakeDirectories {
	
	private static void  usage(){
		System.err.println(
				"Usage:MakeDirectories path1 ...\n"
				+ "creates each path\n"
				+ "Usage:MakeDirectories -d path1 ..\n"
				+ "Delete each path\n"
				+ "Usage:MakeDirectories -r path2\n"
				+ "Renames from path1 to path2.");
		System.exit(1);
	}
	private static void fileData(File f){
		System.out.println(
				"Absolute path:"+f.getAbsolutePath()
				+"\n can read:"+f.canRead()
				+"\n can write:"+f.canWrite()
				+"\n getName:"+f.getName()
				+"\n getParent:"+f.getParent()
				+"\n getPath:"+f.getPath()
				+"\n length:"+f.length()
				+"\n lastModified:"+f.lastModified());
		if(f.isFile()){
			System.out.println("it's a file.");
		}else{
			System.out.println("It's a Directory");
		}
	}
	
	public static void main(String[] args) {
		if(args.length<1)usage();
		if(args[0].equals("-r")){
			if(args.length!=3) usage();
			File old = new File(args[1]),
					rname=new File(args[2]);
			old.renameTo(rname);
			fileData(old);
			fileData(rname);
			return;
		}
		int count=0;
		boolean del =false;
		if(args[0].equals("-d")){
			count++;
			del=true;
		}
		count--;
		while(++count<args.length){
			File f = new File(args[count]);
			if(f.exists()){
				System.out.println(f+"exists");
				if(del){
					System.out.println("deleteing..."+f);
					f.delete();
				}
			}else{
				if(!del){
					f.mkdir();
					System.out.println("created "+f);
				}
			}
			fileData(f);
		}
	}

}
