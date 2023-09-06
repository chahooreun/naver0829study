
public class Ex9_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="apple";
		String str2="Apple";
		String str3="Have a Good Day";
		String str4="   Happy        ";
		
		System.out.println(str3.length());//str3의 총 길이 : 15
		System.out.println(str1.toLowerCase());//str1을 모두 소문자로 변환
		System.out.println(str2.toUpperCase());//str2를 모두 대문자로 변환
		System.out.println(str3.substring(5));//str3를 5번 부터 끝까지 출력
		System.out.println(str3.substring(7, 11));//str3에서 7부터 10까지 추출해서 출력
		System.out.println(str3.charAt(0));//str3에서 0번 문자 출력
		System.out.println(str3.charAt(7));//str3에서 7번 문자 출력
		System.out.println(str3.indexOf('a'));//str3에서 첫번째'a'의 인덱스 값
		System.out.println(str3.lastIndexOf('a'));//str3에서 마지막 'a'의 위치
		System.out.println(str4.length());//str4앞뒤 공백을 포함한 전체 길이
		System.out.println(str4.trim().length());//앞뒤 공백 제거후 길이 구하기
		System.out.println(str3.startsWith("Have"));//str3가 Have로 시작하면 true
		System.out.println(str3.endsWith("day"));//str1이 str2와 대소문자까지 같을경우 true
		System.out.println(str1.equals(str2));//대소문자 상관없이 철자만 같으면 true
		System.out.println(str1.equalsIgnoreCase(str2));//str1rhk str2의 차이(양수값:str1이 더큰값,음수값:str2 가 더 큰경우)
		System.out.println(str1.compareTo("apple"));//완전 같을 경우 0
		



	}

}
