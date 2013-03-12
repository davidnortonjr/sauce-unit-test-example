describe("JavaScript Array", function() {

  it("should be able to splice", function() {
    myArray = ['a', 'b', 'c'];
    myArray.splice(1);

    expect(myArray.length).toEqual(1);
    expect(myArray[0]).toEqual('a');
  });

});