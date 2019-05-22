package com.codeclan.filingsystem.FilingSystem.components;

import com.codeclan.filingsystem.FilingSystem.models.File;
import com.codeclan.filingsystem.FilingSystem.models.Folder;
import com.codeclan.filingsystem.FilingSystem.repositories.FileRepository;
import com.codeclan.filingsystem.FilingSystem.repositories.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;

public class DataLoader {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args) {
        Folder folder1 = new Folder("pictures");
        folderRepository.save(folder1);

        Folder folder2 = new Folder("documents");
        folderRepository.save(folder2);

        File file1 = new File(".jpg", 3, folder1);
        fileRepository.save(file1);

        File file2 = new File(".txt", 2, folder1);
        fileRepository.save(file2);

        File file3 = new File(".pdf", 9, folder1);
        fileRepository.save(file3);

        File file4 = new File(".zip", 5, folder2);
        fileRepository.save(file4);

        File file5 = new File(".ppt", 4, folder2);
        fileRepository.save(file5);
    }

}
