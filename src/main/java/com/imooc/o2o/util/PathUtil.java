package com.imooc.o2o.util;

public class PathUtil {

	private static String seperator = "/";

	public static String getImgBasePath() {
		String os = System.getProperty("os.name");
		String basePath = "";

		if (os.toLowerCase().startsWith("win")) {
			basePath = "D:/projectdev/image";
		} else {
			basePath = "/Users/chen/projectimage";
		}
		basePath = basePath.replace("/", seperator);
		return basePath;
	}

	public static String getShopImagePath(long shopId) {
		String imagePath = "/upload/images/item/shop/" + shopId + "/";
		return imagePath.replace("/", seperator);
	}

}
