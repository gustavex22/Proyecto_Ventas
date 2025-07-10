// Definición de tipos TypeScript
        type Persona = {
            id: number;
            nombre: string;
            edad: number;
            email: string;
        };

        // Variables
        let tableData: Persona[] = [];
        let nextId = 1;

        // Elementos del DOM
        const tableBody = document.querySelector('#table1 tbody') as HTMLTableSectionElement;
        const addSampleBtn = document.getElementById('addSampleData') as HTMLButtonElement;
        const clearTableBtn = document.getElementById('clearTable') as HTMLButtonElement;
        const addRowBtn = document.getElementById('addRowBtn') as HTMLButtonElement;
        const nameInput = document.getElementById('nameInput') as HTMLInputElement;
        const ageInput = document.getElementById('ageInput') as HTMLInputElement;
        const emailInput = document.getElementById('emailInput') as HTMLInputElement;

        // Función para renderizar la tabla
        function renderTable(): void {
            tableBody.innerHTML = '';

            tableData.forEach(persona => {
                const row = document.createElement('tr');
                
                row.innerHTML = `
                    <td>${persona.nombre}</td>
                    <td>${persona.edad}</td>
                    <td>${persona.email}</td>
                    <td>
                        <button class="delete-btn" data-id="${persona.id}">Eliminar</button>
                    </td>
                `;

                tableBody.appendChild(row);
            });

            // Agregar event listeners para los botones de eliminar
            document.querySelectorAll('.delete-btn').forEach(btn => {
                btn.addEventListener('click', (e) => {
                    const id = parseInt((e.target as HTMLElement).getAttribute('data-id')!);
                    deleteRow(id);
                });
            });
        }

        // Función para añadir una persona
        function addPerson(persona: Omit<Persona, 'id'>): void {
            tableData.push({
                id: nextId++,
                ...persona
            });
            renderTable();
        }

        // Función para eliminar una fila
        function deleteRow(id: number): void {
            tableData = tableData.filter(persona => persona.id !== id);
            renderTable();
        }

        // Event Listeners
        addSampleBtn.addEventListener('click', () => {
            const sampleData: Omit<Persona, 'id'>[] = [
                { nombre: 'Juan Pérez', edad: 30, email: 'juan@example.com' },
                { nombre: 'María García', edad: 25, email: 'maria@example.com' },
                { nombre: 'Carlos López', edad: 35, email: 'carlos@example.com' }
            ];

            sampleData.forEach(persona => addPerson(persona));
        });

        clearTableBtn.addEventListener('click', () => {
            tableData = [];
            renderTable();
        });

        addRowBtn.addEventListener('click', () => {
            const nombre = nameInput.value.trim();
            const edad = parseInt(ageInput.value);
            const email = emailInput.value.trim();

            if (!nombre || isNaN(edad) || !email) {
                alert('Por favor, complete todos los campos correctamente');
                return;
            }

            addPerson({ nombre, edad, email });

            // Limpiar inputs
            nameInput.value = '';
            ageInput.value = '';
            emailInput.value = '';
            nameInput.focus();
        });

        // Permitir añadir con Enter
        document.querySelectorAll('input').forEach(input => {
            input.addEventListener('keypress', (e) => {
                if (e.key === 'Enter') {
                    addRowBtn.click();
                }
            });
        });