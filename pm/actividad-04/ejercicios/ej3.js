import { StyleSheet, View } from "react-native";
import { useState } from 'react';

export default function App() {
  const [figure, setFigure] = useState([
    { style: styles.triangle, row: 1},
    { style: styles.square, row: 2},
    { style: styles.rectangle}
  ]);

  return (
    <View style={[styles.container, { flexDirection: 'column' }]}>
      {figure.map((elem, index) => (
        <View key={index} style={elem.style}></View>
      ))}
    </View>
  )
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
  square: {
    width: 100,
    height: 100,
    backgroundColor: 'blue'
  },
  triangle: {
    width: 0,
    height: 0,
    backgroundColor: 'transparent',
    borderLeftWidth: 50,
    borderRightWidth: 50,
    borderBottomWidth: 100,
    borderLeftColor: 'transparent',
    borderRightColor: 'transparent',
    borderBottomColor: 'blue'
  },
  rectangle: {
    width: 200,
    height: 100,
    backgroundColor: 'blue'
  }
})