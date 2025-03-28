package kr.kh.spring.utils;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.UUID;

import org.springframework.util.FileCopyUtils;

public class UploadFileUtils {
    public static String uploadFile(String uploadPath, String originalName, byte[]
            fileData)throws Exception{
        UUID uid = UUID.randomUUID();
        String savedName = uid.toString() +"_" + originalName;
        //날짜를 이용하여 폴더를 생성하여 관리
        String savedPath = calcPath(uploadPath);
        //서버에서 업로드 경로와 날짜 경로를 이용하여 빈 파일 생성
        File target = new File(uploadPath + savedPath, savedName);
        //업로드할 파일 데이터를 이용하여 복사를 진행
        FileCopyUtils.copy(fileData, target);
        //날짜 폴더와 업로드된 파일명이 있는 문자열을 리턴
        String uploadFileName = getFileName(savedPath, savedName);
        return uploadFileName;
    }

    private static String calcPath(String uploadPath) {
    	//현재 시간을 캘린터 객체로 가져옴
        Calendar cal = Calendar.getInstance();
        
        //연을 추출해서 앞에 구분자를 추가 \\2025
        String yearPath = File.separator+cal.get(Calendar.YEAR);
        // \\2025\\03
        String monthPath = yearPath + File.separator
            + new DecimalFormat("00").format(cal.get(Calendar.MONTH)+1);
        // \\2025\\03\\26
        String datePath = monthPath + File.separator
            + new DecimalFormat("00").format(cal.get(Calendar.DATE));
        makeDir(uploadPath, yearPath, monthPath, datePath);

        return datePath;

    }
    private static void makeDir(String uploadPath, String... paths) {
        if(new File(paths[paths.length-1]).exists())
            return;
        for(String path : paths) {
            File dirPath = new File(uploadPath + path);
            if( !dirPath.exists())
                dirPath.mkdir();
        }
    }
    private static String getFileName(String path, String fileName)
            throws Exception{
        String iconName = path + File.separator + fileName;
        return iconName.replace(File.separatorChar, '/');
    }
    public static void deleteFile(String uploadPath, String fi_name) {
				fi_name = fi_name.replace('/', File.separatorChar);
				File file = new File(uploadPath + fi_name);
				//파일이 존재하면 파일을 삭제
				if(file.exists()) {
						file.delete();
				}
		}
}
