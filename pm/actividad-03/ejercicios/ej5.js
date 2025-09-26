import { Text, Pressable, View, TextInput, StyleSheet, Alert } from 'react-native';
import { useState } from 'react';

export default function App() {
  const [disK, setDisK] = useState();
  const [disM, setDisM] = useState(0);

  function handleOnPress() {
    setDisM(disK * 0.62);
  }
  
  return (
    <View style={styles.container}>
      <Text style={styles.title}>Convertidor de km a millas</Text>
      <TextInput
        style={{ height: 40 }}
        placeholder='Inserta tu texto...'
        onChangeText={(newText) => setDisK(newText)}
        defaultValue={disK}
      />
      <Text>{disM} millas</Text>
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