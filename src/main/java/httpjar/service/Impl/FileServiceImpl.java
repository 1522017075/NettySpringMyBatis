package httpjar.service.Impl;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import com.blade.mvc.multipart.FileItem;

import httpjar.service.FileService;

public class FileServiceImpl implements FileService {

	@Override
	public boolean saveFile(FileItem fileItem) {
		// TODO Auto-generated method stub
		boolean success = false;
		try {
		String fileName = getRandomFileName(fileItem.getFileName());
        String workingDirectory = System.getProperty("user.dir");
        String absoluteFilePath = "";
        absoluteFilePath = workingDirectory + File.separator + fileName;
        
        File file = new File(absoluteFilePath);
        fileItem.moveTo(file);

        System.out.println("File is save as :" + absoluteFilePath);
        success = true;
        
      	} catch (IOException e) {
      		e.printStackTrace();
      	}
		return success;
	}

	private String getRandomFileName(String fileName) {
		String uuid = UUID.randomUUID().toString().replaceAll("-","");
		int pos = fileName.lastIndexOf(".");
		String postfix = "";
        if(pos != -1){
            // 原文件后缀
        	postfix = "." + fileName.substring(pos+1);
        } 
		return uuid + postfix;
	}

}
