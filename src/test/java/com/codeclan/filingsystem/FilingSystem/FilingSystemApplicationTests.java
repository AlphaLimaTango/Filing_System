package com.codeclan.filingsystem.FilingSystem;

import com.codeclan.filingsystem.FilingSystem.models.File;
import com.codeclan.filingsystem.FilingSystem.models.Folder;
import com.codeclan.filingsystem.FilingSystem.repositories.FileRepository;
import com.codeclan.filingsystem.FilingSystem.repositories.FolderRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FilingSystemApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createFileAndFolder(){
		Folder folder = new Folder("pictures");
		folderRepository.save(folder);

		File file = new File(".jpg", 5, folder);
		fileRepository.save(file);
	}

}
