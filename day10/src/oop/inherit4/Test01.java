package oop.inherit4;

public class Test01 {
	public static void main(String[] args) {
		Mp3 a = new Mp3();
		a.setFilename("test.mp3");
		a.setFilesize(100L);
		a.setDuration(3 * 60);
		a.execute();
		a.forward();
		a.rewind();
		
		Mp4 b = new Mp4();
		b.setFilename("수업영상.mp4");
		b.setFilesize(1L * 1024 * 1024 * 1024);//1GiB
		b.setSpeed(1.2);
		b.execute();
		b.forward();
		b.rewind();
		
		Hwp c = new Hwp();
		c.setFilename("평가.hwp");
		c.setFilesize(1L * 1024L * 1024L);//1MiB
		c.setPageSize(10);
		c.execute();
		c.preview();
		
		Ppt d = new Ppt();
		d.setFilename("발표.pptx");
		d.setFilesize(5L * 1024L * 1024L);//5MiB
		d.setPageSize(30);
		d.execute();
		d.slideShow();
	}
}
