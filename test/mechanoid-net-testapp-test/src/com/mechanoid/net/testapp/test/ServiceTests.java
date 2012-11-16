package com.mechanoid.net.testapp.test;

import java.util.ArrayList;
import java.util.List;

import android.test.InstrumentationTestCase;

import com.mechanoid.net.Day;
import com.mechanoid.net.EchoHeadersRequest;
import com.mechanoid.net.EchoHeadersResult;
import com.mechanoid.net.EchoParamsRequest;
import com.mechanoid.net.EchoParamsResult;
import com.mechanoid.net.GetABResult;
import com.mechanoid.net.GetBooleanArrayResult;
import com.mechanoid.net.GetDoubleArrayResult;
import com.mechanoid.net.GetEnumArrayResult;
import com.mechanoid.net.GetIntArrayResult;
import com.mechanoid.net.GetItemResult;
import com.mechanoid.net.GetLongArrayResult;
import com.mechanoid.net.GetNodesResult;
import com.mechanoid.net.GetStringArrayResult;
import com.mechanoid.net.HeaderItem;
import com.mechanoid.net.Item;
import com.mechanoid.net.Node;
import com.mechanoid.net.PostIntRequest;
import com.mechanoid.net.PostIntResult;
import com.mechanoid.net.PostStringArrayRequest;
import com.mechanoid.net.PostStringArrayResult;
import com.mechanoid.net.PostStringRequest;
import com.mechanoid.net.PostStringResult;
import com.mechanoid.net.SkippingPostRequest;
import com.mechanoid.net.SkippingPostResult;
import com.mechanoid.net.SkippingResult;
import com.mechanoid.net.SkippingWithItemResult;
import com.mechanoid.net.TestService;
import com.robotoworks.mechanoid.net.Response;
import com.robotoworks.mechanoid.net.ServiceException;

public class ServiceTests extends InstrumentationTestCase {
	
	public void testGetStringArray() throws ServiceException {
		TestService service = new TestService();
		Response<GetStringArrayResult> response = service.getStringArray();
		
		GetStringArrayResult content = response.parse();
		
		List<String> actual = content.getValues();
		
		assertEquals("lorem", actual.get(0));
		assertEquals("ipsum", actual.get(1));
		assertEquals("dolor", actual.get(2));
	}
	
	public void testGetIntArray() throws ServiceException {
		TestService service = new TestService();
		Response<GetIntArrayResult> response = service.getIntArray();
		
		GetIntArrayResult content = response.parse();
		
		List<Integer> actual = content.getValues();
		
		assertEquals(Integer.valueOf(1), actual.get(0));
		assertEquals(Integer.valueOf(3), actual.get(1));
		assertEquals(Integer.valueOf(5), actual.get(2));
	}
	
	public void testGetLongArray() throws ServiceException {
		TestService service = new TestService();
		Response<GetLongArrayResult> response = service.getLongArray();
		
		GetLongArrayResult content = response.parse();
		
		List<Long> actual = content.getValues();
		
		assertEquals(Long.valueOf(1), actual.get(0));
		assertEquals(Long.valueOf(3), actual.get(1));
		assertEquals(Long.valueOf(5), actual.get(2));
	}
	
	public void testGetDoubleArray() throws ServiceException {
		TestService service = new TestService();
		Response<GetDoubleArrayResult> response = service.getDoubleArray();
		
		GetDoubleArrayResult content = response.parse();
		
		List<Double> actual = content.getValues();
		
		assertEquals(Double.valueOf(1.1), actual.get(0));
		assertEquals(Double.valueOf(2.3), actual.get(1));
		assertEquals(Double.valueOf(3.5), actual.get(2));
	}
	
	public void testGetBooleanArray() throws ServiceException {
		TestService service = new TestService();
		
		Response<GetBooleanArrayResult> response = service.getBooleanArray();
		
		GetBooleanArrayResult content = response.parse();
		
		List<Boolean> actual = content.getValues();
		
		assertEquals(Boolean.valueOf(true), actual.get(0));
		assertEquals(Boolean.valueOf(false), actual.get(1));
		assertEquals(Boolean.valueOf(true), actual.get(2));
	}
	
	public void testGetEnumArray() throws ServiceException {
		TestService service = new TestService();
		
		Response<GetEnumArrayResult> response = service.getEnumArray();
		
		GetEnumArrayResult content = response.parse();
		
		List<Day> actual = content.getDays();
		
		assertEquals(Day.MONDAY, actual.get(0));
		assertEquals(Day.TUESDAY, actual.get(1));
		assertEquals(Day.WEDNESDAY, actual.get(2));
		assertEquals(Day.THURSDAY, actual.get(3));
		assertEquals(Day.FRIDAY, actual.get(4));
	}
	
	public void testGetItem() throws ServiceException {
		TestService service = new TestService();
		
		Response<GetItemResult> response = service.getItem();
		
		GetItemResult content = response.parse();
		
		Item actual = content.getItem();
		
		assertEquals("lorem", actual.getA());
		assertEquals(5, actual.getB());
		assertEquals(100, actual.getC());
		assertEquals(1.4d, actual.getD());
		assertEquals(true, actual.isE());
	}
	
	public void testGetNodes() throws ServiceException {
		TestService service = new TestService();
		
		Response<GetNodesResult> response = service.getNodes();
		
		GetNodesResult content = response.parse();
		
		List<Node> nodes = content.getNodes();
		
		assertEquals("a", nodes.get(0).getName());
		assertEquals("b", nodes.get(0).getChildren().get(0).getName());
		assertEquals("c", nodes.get(0).getChildren().get(1).getName());
		assertEquals("d", nodes.get(1).getName());
		assertEquals(0, nodes.get(1).getChildren().size());
	}
	
	public void testEchoParams() throws ServiceException {
		TestService service = new TestService();
		
		EchoParamsRequest request = new EchoParamsRequest()
									.setAParam("lorem")
									.setBParam(true)
									.setCParam(1.3d)
									.setDParam(3)
									.setEParam(42);
		
		Response<EchoParamsResult> response = service.echoParams(request);
		
		EchoParamsResult content = response.parse();
		
		List<String> params = content.getValues();
		
		assertEquals("lorem", params.get(0));
		assertEquals("true", params.get(1));
		assertEquals("1.3", params.get(2));
		assertEquals("3", params.get(3));
		assertEquals("42", params.get(4));
	}
	
	public void testSkipping() throws ServiceException {
		TestService service = new TestService();
		
		Response<SkippingResult> response = service.skipping();
		
		SkippingResult content = response.parse();
		
		assertEquals("lorem", content.getA());
		assertEquals(3, content.getB());
		assertEquals(42, content.getC());
	}
	
	public void testSkippingWithItem() throws ServiceException {
		TestService service = new TestService();
		
		Response<SkippingWithItemResult> response = service.skippingWithItem();
		
		SkippingWithItemResult content = response.parse();
		
		assertEquals("lorem", content.getInner().getA());
		assertEquals(3, content.getInner().getB());
		assertEquals(42, content.getInner().getC());
	}
	
	public void testAB() throws ServiceException {
		TestService service = new TestService();
		
		Response<GetABResult> response = service.getAB();
		
		GetABResult content = response.parse();
		
		assertEquals("I am A", content.getA().getName());
		assertEquals("I am B", content.getA().getB().getName());
		assertEquals("I am another A", content.getA().getB().getA().getName());
		assertNull(content.getA().getB().getA().getB());
	}
	
	public void testSkippingPost() throws ServiceException {
		TestService service = new TestService();
		
		SkippingPostRequest request = new SkippingPostRequest("ipsum", 12, 45);
		
		Response<SkippingPostResult> response = service.skippingPost(request);
		
		SkippingPostResult content = response.parse();
		
		assertEquals(request.getA(), content.getA());
		assertEquals(request.getB(), content.getB());
		assertEquals(request.getC(), content.getC());
	}
	
	public void testPostInt() throws ServiceException {
		TestService service = new TestService();
		
		PostIntRequest request = new PostIntRequest(42);
		
		Response<PostIntResult> response = service.postInt(request);
		
		PostIntResult result = response.parse();
		
		assertEquals(request.getValue(), result.getValue());
	}
	
	public void testPostString() throws ServiceException {
		TestService service = new TestService();
		
		PostStringRequest request = new PostStringRequest("Hello, world!");
		
		Response<PostStringResult> response = service.postString(request);
		
		PostStringResult result = response.parse();
		
		assertEquals(request.getValue(), result.getValue());
	}
	
	public void testPostStringArray() throws ServiceException {
		TestService service = new TestService();
		
		List<String> values = new ArrayList<String>();
		values.add("Hello");
		values.add("World");

		PostStringArrayRequest request = new PostStringArrayRequest(values);
		
		Response<PostStringArrayResult> response = service.postStringArray(request);
		
		PostStringArrayResult result = response.parse();
		
		assertEquals(request.getValues().get(0), result.getValues().get(0));
		assertEquals(request.getValues().get(1), result.getValues().get(1));
	}
	
	public void testHeadersDeclaredInDSL() throws ServiceException {
		TestService service = new TestService();
		
		HeaderItem itemA = new HeaderItem("x-a", "A");
		HeaderItem itemB = new HeaderItem("x-b", "B");
		HeaderItem itemC = new HeaderItem("x-c", "C");
		
		Response<EchoHeadersResult> response = service.echoHeaders();
		
		EchoHeadersResult result = response.parse();
		
		List<HeaderItem> items = result.getHeaderItems();
		
		// Client Level
		assertTrue(items.contains(itemA));
		assertTrue(items.contains(itemB));
		
		// Method Level
		assertTrue(items.contains(itemC));
	}
	
	public void testHeadersAddedProgrammatically() throws ServiceException {
		TestService service = new TestService();
		
		HeaderItem itemY = new HeaderItem("x-y", "Y");
		HeaderItem itemZ = new HeaderItem("x-z", "Z");
		
		service.setHeader("x-y", "Y");
		
		EchoHeadersRequest request = new EchoHeadersRequest();
		request.setHeader("x-z", "Z");
		
		Response<EchoHeadersResult> response = service.echoHeaders(request);
		
		EchoHeadersResult result = response.parse();
		
		List<HeaderItem> items = result.getHeaderItems();
		
		// Client Level
		assertTrue(items.contains(itemY));
		
		// Method Level
		assertTrue(items.contains(itemZ));
	}
	
	public void testHeadersOverriding() throws ServiceException {
		TestService service = new TestService();
		
		// Override headers x-a and x-b declared in model
		HeaderItem itemA = new HeaderItem("x-a", "Hello");
		HeaderItem itemB = new HeaderItem("x-b", "World");
		
		service.setHeader("x-a", "Hello");
		
		EchoHeadersRequest request = new EchoHeadersRequest();
		request.setHeader("x-b", "World");
		
		Response<EchoHeadersResult> response = service.echoHeaders(request);
		
		EchoHeadersResult result = response.parse();
		
		List<HeaderItem> items = result.getHeaderItems();
		
		// Client Level
		assertTrue(items.contains(itemA));
		
		// Method Level
		assertTrue(items.contains(itemB));
	}
}
