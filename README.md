
# ETH-beginners
# MyToken

MyToken is a simple Solidity smart contract that implements a basic token with minting and burning functions. It allows you to create and destroy tokens, while keeping track of the total supply and individual balances.

## Contract Details

The contract includes the following public variables:

- `tokenName`: The name of the token (e.g., "META").
- `tokenAbbrv`: The abbreviation or symbol of the token (e.g., "MTA").
- `totalSupply`: The total supply of tokens in circulation.

It also utilizes a mapping variable:

- `balances`: A mapping of addresses to token balances, where each address is associated with a specific balance.

## Mint Function

The `mint` function allows the creation of new tokens. It takes two parameters:

- `_address`: The address to which the new tokens will be allocated.
- `_value`: The amount of tokens to be created.

The function increases the total supply by `_value` and increments the balance of the specified address by the same amount.

## Burn Function

The `burn` function allows the destruction of existing tokens. It also takes two parameters:

- `_address`: The address from which the tokens will be deducted.
- `_value`: The amount of tokens to be destroyed.

Before deducting the tokens, the function checks if the balance of the specified address is greater than or equal to `_value`. If the condition is met, it reduces the total supply and decrements the balance accordingly.
Please note that the burn function will only execute if the balance of the sender is sufficient to cover the requested burn amount.

License
This contract is released under the MIT License. You can find the full text of the license in the SPDX-License-Identifier section at the top of the contract file.
Please note that the `burn` function will only execute if the balance of the sender is sufficient to cover the requested burn amount.

## License
This contract is released under the MIT License. You can find the full text of the license in the SPDX-License-Identifier section at the top of the contract file.
