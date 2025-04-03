package com.ServiciosWeb.CloudAPI.Config;

import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.BlobServiceClientBuilder;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AzureBlobStorageConfig {

    @Value("${azure.storage.connection-string}")
    private String connexionString;

    @Value("${azure.storage.container-name}")
    private String contenedorNombre;

    @Bean
    public BlobServiceClient blobServiceClient() {
        return new BlobServiceClientBuilder()
                .connectionString(this.connexionString)
                .buildClient();
    }

    @Bean
    public BlobContainerClient blobContainerClient() {
        return blobServiceClient().getBlobContainerClient(contenedorNombre);
    }
}
