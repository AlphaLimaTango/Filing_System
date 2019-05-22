package com.codeclan.filingsystem.FilingSystem.projections;

import com.codeclan.filingsystem.FilingSystem.models.File;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedFolder", types = File.class)
public interface EmbedFolder {

    String getName();
    File getFiles();
}
