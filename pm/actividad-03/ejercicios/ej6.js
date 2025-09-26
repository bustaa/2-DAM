import { Text, Pressable, View, TextInput, StyleSheet, Alert } from 'react-native';
import { useState } from 'react';

export default function App() {
  const [euro, setEuro] = useState();
  const [dollar, setDollar] = useState(0);

  function handleOnPress() {
    setDollar(euro * 1.17);
  }
  
  return (
    <View style={styles.container}>
      <Text style={styles.title}>Convertidor € - $</Text>
      <TextInput
        style={{ height: 40 }}
        placeholder='Inserta euros'
        onChangeText={(newText) => setEuro(newText)}
        defaultValue={euro}
      />
      <Text>{dollar} $</Text>
      <Pressable 
        onPress={() => handleOnPress()}
        style={styles.btn}
      >
        <Text style={styles.btnText}>Pulsa...</Text>
      </Pressable>
    </View>
  )
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center'
  },
  btn: {
    marginTop: 15,
    backgroundColor: 'blue',
    width: 100,
    height: 40,
    borderRadius: 5,
    color: 'green'
  },
  btnText: {
    color: 'white',
    margin:'auto'
  },
  title: {
    fontSize: 20,
    fontWeight: 600
  }
})