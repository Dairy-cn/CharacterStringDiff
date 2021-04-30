package com.dairy.util;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Dair
 * @since
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
class DiffMatchPatchTest {
	
	
	@Test
	void getHtmlDiffString() {
		String string1 = "为了加强对人民币的管理，维护人民币的信誉，稳定金融秩序，根据《中华人民共和国中国人民银行法》，制定本条例。";
		String string2 = "为了加强对人民币的管理，维护人民币的信誉，稳定金融秩序，健全法制，根据《中华人民共和国中国人民银行法》，制定中华人民共和国人民币管理条例。";
		
		DiffMatchPatch diffMatchPatch = new DiffMatchPatch();
		String diffString = diffMatchPatch.getHtmlDiffString(string1, string2);
		System.out.println(diffString);
		
	}
}