package com.mechanoid.net.testapp.test;

import java.io.IOException;
import java.util.List;

import org.apache.http.client.ClientProtocolException;

import android.test.InstrumentationTestCase;

import com.mechanoid.net.Day;
import com.mechanoid.net.EchoParamsRequest;
import com.mechanoid.net.EchoParamsResponse;
import com.mechanoid.net.GetABResponse;
import com.mechanoid.net.GetBooleanArrayResponse;
import com.mechanoid.net.GetDoubleArrayResponse;
import com.mechanoid.net.GetEnumArrayResponse;
import com.mechanoid.net.GetIntArrayResponse;
import com.mechanoid.net.GetItemRequest;
import com.mechanoid.net.GetItemResponse;
import com.mechanoid.net.GetLongArrayResponse;
import com.mechanoid.net.GetNodesResponse;
import com.mechanoid.net.GetStringArrayResponse;
import com.mechanoid.net.Item;
import com.mechanoid.net.Node;
import com.mechanoid.net.SkippingPostRequest;
import com.mechanoid.net.SkippingPostResponse;
import com.mechanoid.net.SkippingResponse;
import com.mechanoid.net.SkippingWithItemResponse;
import com.mechanoid.net.TestService;
import com.robotoworks.mechanoid.net.Response;
import com.robotoworks.mechanoid.net.ServiceException;
import com.robotoworks.mechanoid.net.TransformException;

public class ServiceTests extends InstrumentationTestCase {
	public void testGetStringArray() throws ServiceException {
		TestService service = new TestService();
		Response<GetStringArrayResponse> response = service.getStringArray();
		
		GetStringArrayResponse content = response.parse();
		
		List<String> actual = content.getValues();
		
		assertEquals("lorem", actual.get(0));
		assertEquals("ipsum", actual.get(1));
		assertEquals("dolor", actual.get(2));
	}
	
	public void testGetIntArray() throws ServiceException {
		TestService service = new TestService();
		Response<GetIntArrayResponse> response = service.getIntArray();
		
		GetIntArrayResponse content = response.parse();
		
		List<Integer> actual = content.getValues();
		
		assertEquals(Integer.valueOf(1), actual.get(0));
		assertEquals(Integer.valueOf(3), actual.get(1));
		assertEquals(Integer.valueOf(5), actual.get(2));
	}
	
	public void testGetLongArray() throws ServiceException {
		TestService service = new TestService();
		Response<GetLongArrayResponse> response = service.getLongArray();
		
		GetLongArrayResponse content = response.parse();
		
		List<Long> actual = content.getValues();
		
		assertEquals(Long.valueOf(1), actual.get(0));
		assertEquals(Long.valueOf(3), actual.get(1));
		assertEquals(Long.valueOf(5), actual.get(2));
	}
	
	public void testGetDoubleArray() throws ServiceException {
		TestService service = new TestService();
		Response<GetDoubleArrayResponse> response = service.getDoubleArray();
		
		GetDoubleArrayResponse content = response.parse();
		
		List<Double> actual = content.getValues();
		
		assertEquals(Double.valueOf(1.1), actual.get(0));
		assertEquals(Double.valueOf(2.3), actual.get(1));
		assertEquals(Double.valueOf(3.5), actual.get(2));
	}
	
	public void testGetBooleanArray() throws ServiceException {
		TestService service = new TestService();
		
		Response<GetBooleanArrayResponse> response = service.getBooleanArray();
		
		GetBooleanArrayResponse content = response.parse();
		
		List<Boolean> actual = content.getValues();
		
		assertEquals(Boolean.valueOf(true), actual.get(0));
		assertEquals(Boolean.valueOf(false), actual.get(1));
		assertEquals(Boolean.valueOf(true), actual.get(2));
	}
	
	public void testGetEnumArray() throws ServiceException {
		TestService service = new TestService();
		
		Response<GetEnumArrayResponse> response = service.getEnumArray();
		
		GetEnumArrayResponse content = response.parse();
		
		List<Day> actual = content.getDays();
		
		assertEquals(Day.MONDAY, actual.get(0));
		assertEquals(Day.TUESDAY, actual.get(1));
		assertEquals(Day.WEDNESDAY, actual.get(2));
		assertEquals(Day.THURSDAY, actual.get(3));
		assertEquals(Day.FRIDAY, actual.get(4));
	}
	
	public void testGetItem() throws ServiceException {
		TestService service = new TestService();
		
		Response<GetItemResponse> response = service.getItem();
		
		GetItemResponse content = response.parse();
		
		Item actual = content.getItem();
		
		assertEquals("lorem", actual.getA());
		assertEquals(5, actual.getB());
		assertEquals(100, actual.getC());
		assertEquals(1.4d, actual.getD());
		assertEquals(true, actual.isE());
	}
	
	public void testGetNodes() throws ServiceException {
		TestService service = new TestService();
		
		Response<GetNodesResponse> response = service.getNodes();
		
		GetNodesResponse content = response.parse();
		
		List<Node> nodes = content.getNodes();
		
		assertEquals("a", nodes.get(0).getName());
		assertEquals("b", nodes.get(0).getChildren().get(0).getName());
		assertEquals("c", nodes.get(0).getChildren().get(1).getName());
		assertEquals("d", nodes.get(1).getName());
		assertEquals(0, nodes.get(1).getChildren().size());
	}
	
	public void testEchoParams() throws ServiceException {
		TestService service = new TestService();
		
		EchoParamsRequest request = new EchoParamsRequest();
		request.setAParam("lorem");
		request.setBParam(true);
		request.setCParam(1.3d);
		request.setDParam(3);
		request.setEParam(42);
		
		Response<EchoParamsResponse> response = service.echoParams(request);
		
		EchoParamsResponse content = response.parse();
		
		List<String> params = content.getValues();
		
		assertEquals("lorem", params.get(0));
		assertEquals("true", params.get(1));
		assertEquals("1.3", params.get(2));
		assertEquals("3", params.get(3));
		assertEquals("42", params.get(4));
	}
	
	public void testSkipping() throws ServiceException {
		TestService service = new TestService();
		
		Response<SkippingResponse> response = service.skipping();
		
		SkippingResponse content = response.parse();
		
		assertEquals("lorem", content.getA());
		assertEquals(3, content.getB());
		assertEquals(42, content.getC());
	}
	
	public void testSkippingWithItem() throws ServiceException {
		TestService service = new TestService();
		
		Response<SkippingWithItemResponse> response = service.skippingWithItem();
		
		SkippingWithItemResponse content = response.parse();
		
		assertEquals("lorem", content.getInner().getA());
		assertEquals(3, content.getInner().getB());
		assertEquals(42, content.getInner().getC());
	}
	
	public void testAB() throws ServiceException {
		TestService service = new TestService();
		
		Response<GetABResponse> response = service.getAB();
		
		GetABResponse content = response.parse();
		
		assertEquals("I am A", content.getA().getName());
		assertEquals("I am B", content.getA().getB().getName());
		assertEquals("I am another A", content.getA().getB().getA().getName());
		assertNull(content.getA().getB().getA().getB());
	}
	
	public void testSkippingPost() throws ServiceException {
		TestService service = new TestService();
		
		SkippingPostRequest request = new SkippingPostRequest("ipsum", 12, 45);
		
		Response<SkippingPostResponse> response = service.skippingPost(request);
		
		SkippingPostResponse content = response.parse();
		
		assertEquals(request.getA(), content.getA());
		assertEquals(request.getB(), content.getB());
		assertEquals(request.getC(), content.getC());
	}
}
