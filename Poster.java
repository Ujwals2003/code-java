class Poster{
	String width;
	String length;
	String content;
	String material;
	public Poster()
	{

	}
	public Poster(String width)
	{
		this.width = width;
	}
	public Poster(String width, String length)
	{
		this.width = width;
		this.length = length;
	}
	public Poster(String width, String length, String content)
	{
		this.width = width;
		this.length = length;
		this.content = content;
	}
	public Poster(String width, String length, String content, String material)
	{
		this.width = width;
		this.length = length;
		this.content = content;
		this.material = material;
	}

	public void Display()
	{
		System.out.println("the poster width :" + width);
		System.out.println("the poster length :" + length);
		System.out.println("the poster content :" + content);
		System.out.println("the poster material :" + material);

	}
}