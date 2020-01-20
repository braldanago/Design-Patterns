package rev;


public class LauncherRev {

	public static void main(String[] args) {
		Directory dir1 = new Directory("dir1");
		Directory dir2 = new Directory("dir2");
		FileSysUtil_Rev sysUtil = new FileSysUtil_Rev();
		
		new Secretary(dir1, dir2, sysUtil);
		new Secretary(dir2, dir1, sysUtil);

	}

}


class Secretary extends Thread{
	
	Directory source,dest;
	FileSysUtil_Rev fileSys;
	public Secretary(Directory s,Directory d,FileSysUtil_Rev sys) {
		this.source=s;
		this.dest=d;
		this.fileSys=sys;
		start();
	}
	
	public void run() {
		fileSys.moveContents(source, dest);
	}
}