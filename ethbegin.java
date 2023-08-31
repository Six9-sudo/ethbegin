// SPDX-License-Identifier: MIT
pragma solidity 0.8.18;

contract MyToken {

    string public name;   // Token Name
    string public symbol; // Token Abbrv.
    uint256 public totalSupply;

    mapping(address => uint256) public balanceOf;

    constructor(string memory _name, string memory _symbol, uint256 _initialSupply) {
        name = _name;
        symbol = _symbol;
        totalSupply = _initialSupply;
        balanceOf[msg.sender] = _initialSupply;
    }

    function mint(address _to, uint256 _value) public {
        require(_to != address(0), "Invalid address");
        totalSupply += _value;
        balanceOf[_to] += _value;
    }

    function burn(address _from, uint256 _value) public {
        require(_from != address(0), "Invalid address");
        require(balanceOf[_from] >= _value, "Insufficient balance");
        totalSupply -= _value;
        balanceOf[_from] -= _value;
    }
}
