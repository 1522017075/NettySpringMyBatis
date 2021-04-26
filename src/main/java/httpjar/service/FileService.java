package httpjar.service;

import com.blade.mvc.multipart.FileItem;

public interface FileService {
	
	boolean saveFile(FileItem fileItem);

}
