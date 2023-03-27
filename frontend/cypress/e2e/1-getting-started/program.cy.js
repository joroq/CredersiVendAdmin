describe('Credersi-Vend Frontend', () => {
  beforeEach(() => {
    cy.visit('http://localhost:8080/')
    const username = 'admin'
    const password = 'HelloWorld'
    cy.get('input#username').type(`${username}`)
    cy.get('input#password').type(`${password}{enter}`)
  })
it('displays customers', () => {

    cy.get('button').should('have.text', 'Create Customer')


  })
  it('Creates large customer name', () => {

    cy.get('button').contains('Create Customer').click()
    cy.get('#placeholder1').click()

    for (let i = 0; i < 200; i++) {
      cy.get('#placeholder1').type('a')
    }
    cy.get('button').contains('OK').click()

  })
  it('Creates Customer name as numbers', () => {

    cy.get('button').contains('Create Customer').click()
    cy.get('#placeholder1').click()

    for (let i = 0; i < 200; i++) {
      cy.get('#placeholder1').type(1)
    }
    cy.get('button').contains('OK').click()
  })
  it('Creates Customer name as special characters', () => {

    cy.get('button').contains('Create Customer').click()
    cy.get('#placeholder1').click()

    for (let i = 0; i < 100; i++) {
      cy.get('#placeholder1').type('@*')
    }
    cy.get('button').contains('OK').click()
})


  it('Creates 200 customers', () => {

    
    for(let i = 0; i < 200; i++) 
    {cy.get('button').contains('Create Customer').click()
    cy.get('button').contains('OK').click()
    
  }

  it('Creates large site name', () => {

    cy.get('items').contains('Pizza Delicious').click()
    cy.get('button').contains('Create Site').click()
    cy.get('#placeholder1').click()
    
    for (let i = 0; i < 200; i++) {
      cy.get('#placeholder1').type('a')

    }
    cy.get('button').contains('OK').click()

  })



})

})










