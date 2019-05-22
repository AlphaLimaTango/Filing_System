package com.codeclan.filingsystem.FilingSystem.projections;

import com.codeclan.filingsystem.FilingSystem.models.Folder;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedShip", types = Folder.class)
public interface EmbedFile {

    String getExtension();
    int getSize();
    Folder getFolder();
}
