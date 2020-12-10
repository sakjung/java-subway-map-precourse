package subway.view;

public enum Section {
	SECTION_0(General.BASIC.getMessage() + "구간 관리 화면"),
	SECTION_1(General.ONE.getMessage() + "구간 등록"),
	SECTION_2(General.TWO.getMessage() + "구간 삭제"),
	SECTION_B(General.THREE.getMessage() + "돌아가기");

	final private String message;

	Section(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
