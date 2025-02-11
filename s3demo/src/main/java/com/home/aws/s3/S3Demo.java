package com.home.aws.s3;

import java.nio.file.Path;

import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.S3ClientBuilder;
import software.amazon.awssdk.services.s3.model.GetObjectRequest;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;

public class S3Demo {

	public static final String BUCKET = "awsspring-suresh";

	public static void main(String[] args) {
		try {
			S3Client client = S3Client.builder().region(Region.US_EAST_2).build();

			PutObjectRequest putRequest = PutObjectRequest.builder().bucket(BUCKET).key("SampleText.txt").build();
			client.putObject(putRequest, Path.of("SampleText.txt"));

			GetObjectRequest request = GetObjectRequest.builder().bucket(BUCKET).key("SampleText.txt").build();

			client.getObject(request, Path.of("SampleTextDownload.txt"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
